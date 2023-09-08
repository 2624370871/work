import chapter0.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("hello world !");
        System.out.println("你好，世界！");
//        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
//        HelloWorld obj1=(HelloWorld) context.getBean("bean1");
//        obj1.getMessage();
//        obj1.setMessage("Helllo 2023!");
//        obj1.getMessage();

        XmlBeanFactory fact=new XmlBeanFactory(
                new ClassPathResource("Beans.xml")
        );
        HelloWorld obj2=(HelloWorld) fact.getBean("bean1");
        obj2.getMessage();
    }
}
