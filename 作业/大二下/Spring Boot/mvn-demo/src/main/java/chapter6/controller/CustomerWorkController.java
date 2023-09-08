package chapter6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/chapter6")
public class CustomerWorkController {
    //不带参数返回
    @RequestMapping("/urlHello")
    String printChapter6Hello(){
        return  "hello";
    }
    @RequestMapping("/viewHello")
ModelAndView printChapterView(){
        ModelAndView obj=new ModelAndView("hello");
        return obj;
    }

    //带参数返回
    @RequestMapping("/paraHello")
    String printPramaHello(ModelMap model){
        model.addAttribute("name","张三");
        model.addAttribute("message","马上放五一");
        return  "hello";
    }
    @RequestMapping("/paraView")
    ModelAndView printPramaView(){
        Map<String ,Object> data=new HashMap<>();
        data.put("name","李四");
        data.put("message","五一不放假");
        ModelAndView model=new ModelAndView("hello",data);
        return model;
    }
}
