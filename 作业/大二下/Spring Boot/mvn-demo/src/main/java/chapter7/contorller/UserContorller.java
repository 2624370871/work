package chapter7.contorller;

import chapter7.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserContorller {
    @RequestMapping("/loginview")
    public String printView(ModelMap model){
        model.addAttribute("msg","请输入用户名和密码!");
        return "chapter7_2_login";
    }
    @RequestMapping("/login")
    public String printLogin(User user, ModelMap model, HttpSession httpSession){
      model.addAttribute("msg","登录对象为："+user.getUsername());

      String username=user.getUsername();
      String password=user.getPassword();
        if(username!=null&&password!=null&&username.equals("admin")&&password.equals("123")){
            model.addAttribute("msg","用户已经登录！");
            httpSession.setAttribute("USER_SESSION",user);
//            return "chapter7_2_home";
            return "redirect:home";
        }else{
            model.addAttribute("msg","用户密码错误");
            return "chapter7_2_login";
        }
    }
    @RequestMapping("/home")
    public String printHome(){
        return "chapter7_2_home";
    }
    @RequestMapping("logout")
    public  String printLogout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:loginview";
    }
}
