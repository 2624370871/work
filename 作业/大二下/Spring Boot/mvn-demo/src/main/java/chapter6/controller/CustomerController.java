package chapter6.controller;

import chapter6.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping
public class CustomerController {
    @RequestMapping(value = "/chapter6",method = RequestMethod.GET)
    public String printHello(){
        return "chapter6_1_index";
    }
    public String userAdd(HttpServletRequest req){
        String name=req.getParameter("name");
        int age=Integer.valueOf(req.getParameter("age"));
        String [] hobby=req.getParameterValues("hobby");
        double price=Double.valueOf(req.getParameter("price"));
        System.out.println("the price is"+price);
        Customer obj=new Customer();
        obj.setAge(age);
        obj.setCustId("1001");
        obj.setName(name);
        obj.setHobby(hobby);
        System.out.println(obj.toString());
        return "hello";
    }
    @RequestMapping(value = "/pojo.do")
    public String pojoRequest(Customer p){
        System.out.println("访问pojo的数据类型绑定");
        System.out.println(p.toString());
        return "hello";
    }
}
