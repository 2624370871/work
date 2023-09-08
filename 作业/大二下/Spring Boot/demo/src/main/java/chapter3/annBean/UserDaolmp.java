package chapter3.annBean;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaolmp {
    public void addUser(User user){
        System.out.println("The username is "+user.getName()+",The id is "+user.getId());
        System.out.println("Add the user to database");
    }
}
