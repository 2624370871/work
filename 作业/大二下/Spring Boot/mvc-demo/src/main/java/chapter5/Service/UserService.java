package chapter5.Service;

import chapter5.dao.UserDaolmp;
import chapter5.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserDaolmp userDaolmp;
    public List<User> getList(){
        List<User> list=userDaolmp.getList();
        return list;
    }
}
