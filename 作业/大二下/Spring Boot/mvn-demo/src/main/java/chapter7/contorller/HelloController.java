package chapter7.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    String printHello(ModelMap model){
        System.out.println("hello接口,请求会被拦截2次");
        model.addAttribute("message","请求会被拦截2次");
        return "hello";
    }

    @RequestMapping("/hello1")
    String printHello1(ModelMap model){
        System.out.println("hello接口,请求会被拦截1次");
        model.addAttribute("message","请求会被拦截1次");
        return "hello";
    }
}
