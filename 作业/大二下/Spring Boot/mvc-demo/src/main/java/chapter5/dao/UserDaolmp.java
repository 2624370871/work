package chapter5.dao;

import chapter5.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaolmp {
    public List<User>getList(){
        List<User> data=new ArrayList<>();
        User u1=new User();
        User u2=new User();
        u1.setId("101");
        u1.setName("张三");
        u2.setId("102");
        u2.setName("李四");
        data.add(u1);
        data.add(u2);
        return data;
    }
}
