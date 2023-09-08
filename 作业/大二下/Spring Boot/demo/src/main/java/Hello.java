import chapter0.HelloWorld;
import chapter3.Person;
import chapter3.annBean.User;
import chapter3.annBean.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Hello {
    public static void main(String[]args) {
        System.out.println("Hello world!");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("bean1");
//        obj.getMessage();
//        obj.setMessage("I change the message!");
//        obj.getMessage();
//        System.out.println(obj.toString());
//
//        System.out.println();
//
//        HelloWorld obj1 = (HelloWorld) context.getBean("bean2");
//        obj1.getMessage();
//        obj.getMessage();
//        System.out.println(obj.toString());
//        System.out.println(obj1.toString());

//        System.out.println();

//        Person objA = (Person) context.getBean("person");
//        objA.printInfo();

//        Person objB = (Person) context.getBean("person2");
//        objB.printInfo();
//        UserController obj0 = (UserController) context.getBean("userController");
//        User student = (User) context.getBean("student1");
//        obj0.save(student);
        context.close();

    }
}
