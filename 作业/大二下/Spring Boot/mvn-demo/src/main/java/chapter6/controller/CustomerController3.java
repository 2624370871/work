package chapter6.controller;

import chapter6.entity.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController3 {
@RequestMapping("/chapter3")
String printchapter3(){
        return "chapter6_3_index";
}

    @RequestMapping(value = "/testJson")
    @ResponseBody
    public Customer printJson(@RequestBody Customer cust) {
        System.out.println(cust.toString());
        return cust;
    }

    @RequestMapping("newJson")
    @ResponseBody
    public Customer printCustomer(@RequestBody Customer user){
        System.out.println(user.toString());
        user.setName("修改后的名字：张三>李四");
        return user;
    }

    @RequestMapping("/showImage")
    String displayImage(){
        return "chapter6_image";
    }

    @RequestMapping("/urlTest")
    String printImage(ModelMap model) {
        model.addAttribute("msg","Spring MVC的封面!");
        return "chapter6_4_result";
    }

}
