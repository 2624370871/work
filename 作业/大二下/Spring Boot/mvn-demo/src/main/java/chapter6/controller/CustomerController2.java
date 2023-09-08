package chapter6.controller;

import chapter6.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CustomerController2 {
    @RequestMapping("/userList")
    public ModelAndView printUserList(){
        Customer c1=new Customer();
        c1.setAge(22);
        c1.setCustId("10001");
        c1.setName("张三");
        Customer c2=new Customer();
        c2.setAge(23);
        c2.setCustId("10002");
        c2.setName("李四");
        List<Customer> data=new ArrayList<>();
        data.add(c1);
        data.add(c2);

        Map<String,Object> result=new HashMap<>();
        result.put("customers",data);
        ModelAndView model=new ModelAndView("customerList",result);
        return model;
    }

    @RequestMapping("/updateList")
    public String printUpdateList(){
        return "customerList";
    }

    //    重定向与请求转发
    @RequestMapping("/redirectList")
    public String printRedirectList() {
//        重定向到 userList 接口
//        return "redirect:userList";
//        请求转发到 userList 接口
        return "forward:userList";
    }
@RequestMapping("/testList")
    public String printTestList(HttpServletRequest req){
        String name=req.getParameter("name");
    System.out.println("姓名是"+name);
    return "hello";
}

@RequestMapping("/redirectList2")
    public String printRedIrectList2(HttpServletRequest req){
//        return "redirect:testList";
    return "forward:userList";
}

    @RequestMapping("/testHello")
    String printHello(ModelMap model){
        model.addAttribute("name","张三");
        model.addAttribute("message","下周放假");
        return "hello";
    }

    @RequestMapping("/testHello1")
        ModelAndView printHelloModel(){
            Map<String ,Object> data=new HashMap<>();
            data.put("name","李四");
            data.put("message","周日要上课");
            ModelAndView model=new ModelAndView("hello",data);
            return model;
    }
}
