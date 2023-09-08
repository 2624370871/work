package chapter5.controller;

import chapter5.Service.UserService;
import chapter5.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value="userList.do",method = RequestMethod.GET)
    ModelAndView getUserList(){
        List<User> data = userService.getList();
        Map<String, Object> result = new HashMap<>();
        result.put("list",data);
        ModelAndView model = new ModelAndView("userList", result);
        return model;
    }
}
