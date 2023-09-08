package chapter3.annBean;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private  UserDaolmp userDaolmp;
public void save(User user){
    System.out.println("I am in user.coontrollep");
    userDaolmp.addUser(user);
}
}
