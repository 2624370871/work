package chapter5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String printHello(ModelMap model){
        model.addAttribute("message","这是第一个Spring MVC框架程序");
        model.addAttribute("name","张三");
        return "hello";
    }
}
