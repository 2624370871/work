package chapter9.po;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class Batis_test {
    private static SqlSessionFactory sqlSessionFactory=null;
    static {
        try {
//            读取batis配置文件
            Reader reader= Resources.getResourceAsReader("chapter9_batis.xml");
            //构造factory对象
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }

    public static void main(String []args){
        System.out.println("hello");
//        首先获取session
        SqlSession sqlSession=getSession();
        String query="chapter9.po.StudentMapper.findStudentByStuno";
       Student stu=sqlSession.selectOne(query,2019030430);

        System.out.println(stu.toString());

        query="chapter9.po.StudentMapper.findStudentByStuname";
        Student stu1=sqlSession.selectOne(query,"张三");

        System.out.println(stu1.toString());

        query="chapter9.po.StudentMapper.countStudent";
        Integer num=sqlSession.selectOne(query);

        System.out.println("总共有"+num+"个用户");

        query="chapter9.po.StudentMapper.findStudentList";
        List<Student>data=sqlSession.selectList(query);
        for(Student each:data){
            System.out.println(each.toString());
        }


        System.out.println("--------------------------------------");
        query="chapter9.po.StudentMapper.findStudentSpList";
        Student st=new Student( 210403020, "小二", 2021,"软件工程", "移动应用开发");
        List<Student> work=sqlSession.selectList(query,st);
        for(Student each:work){
            System.out.println(each.toString());
        }
//        资源关闭
        sqlSession.close();
    }
}
