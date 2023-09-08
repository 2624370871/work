package chapter4;

import chapter4.comTemplate.User;
import chapter4.comTemplate.UserAction;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

public class RequestJDBC {
    public static void main(String[]args){
//        RequestJDBC obj=new RequestJDBC();
//        int num=obj.getUserNum();
//        System.out.println("the ID is "+String.valueOf(num));
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        UserAction ua=(UserAction) context.getBean("userAction");
        int num=ua.getNumber();
        System.out.println("数据库的用户数量有"+ num+"个");
        User user=new User();
        user.setId(10001);
        user.setName("王五");
        user.setAge(19);
        User user1=new User();
//        user1.setId(101);
        ua.updateInsert(user);
        ua.updateDelete(user1);
        ua.findAllMap();;
    }
    public static int getUserNum() {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int num = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/testdata?userSSL=true&serverTimezone=GMT";
            String name = "root";
            String passw = "root";
            try {
                conn = DriverManager.getConnection(url, name, passw);
                String sql = "SELECT * FROM student";
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                rs.next();
                int id=rs.getInt(1);
                String username=rs.getString(2);
                int age=rs.getInt(3);
                System.out.println(String.format("the id={%d},the name={%s},the age={%d}",id,username,age));
                num = rs.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null && !ps.isClosed()) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return num;
    }

}
