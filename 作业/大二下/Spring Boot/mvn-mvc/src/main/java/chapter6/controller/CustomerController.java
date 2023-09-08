package chapter6.controller;

import chapter6.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class CustomerController {
    @RequestMapping(value = "/chapter6",method = RequestMethod.GET)
    public String printHello(ModelMap model){
        return "index";
    }

    @RequestMapping(value = "/userAdd",method = RequestMethod.GET)
    public ModelAndView defaultRequset(HttpServletRequest req){
        String name=req.getParameter("name");
        int age=Integer.valueOf(req.getParameter("age"));
        String[]hobby=req.getParameterValues("hobby");
        ModelMap data=new ModelMap();
        data.addAttribute("name",name);
        String line="";
        for (int i=0;i<hobby.length;i++){
            line+=","+hobby[i];
        }
        String message=String.valueOf(age)+line;
        data.addAttribute("message",message);
        ModelAndView model=new ModelAndView("hello",data);
        return model;
    }


    @RequestMapping(value = "/simple",method = RequestMethod.GET)
    public ModelAndView simpleRequset(String name,int age,String[]hobby){
        Customer obj=new Customer();
        obj.setAge(age);
        obj.setName(name);
        obj.setHobby(hobby);

        ModelMap data=new ModelMap();
        data.addAttribute("message",obj.toString());
        data.addAttribute("name",name);
        ModelAndView model=new ModelAndView("hello",data);
        return model;
    }
}
