package com.boottest.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/boot")
public class HelloController {
    @RequestMapping("/hello")
    public String printHello(){
        return "Hello World";
    }
    @RequestMapping("work")
    public String printwork(
            @RequestParam("name") String name,
            @RequestParam("age") Integer age
    ){
        System.out.println(String.format("name={%s},age={%s}",name,age));
        HashMap data=new HashMap();
        data.put("name",name);
        data.put("age",age);
        data.put("id","111111111");
        Gson g=new Gson();
        String result=g.toJson(data);
        return result;
    }
}
