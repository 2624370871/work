package chapter3.annBean;

import org.springframework.stereotype.Controller;
import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    public void save(User user){
        System.out.println("I am in user controller!");
        userService.save(user);
    }
}
