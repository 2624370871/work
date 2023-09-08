package chapter9;

import chapter9.po.Person;
import chapter9.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class MyBatisTest {
    private static SqlSessionFactory sqlSessionFactory=null;
    static {
        try{
            Reader reader= Resources.getResourceAsReader("chapter9_batis.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSession(){
        return sqlSessionFactory.openSession();
    }


    public static void main(String[] args){
        System.out.println("mybatis test!");
        SqlSession sqlSession=getSession();
        String query="chapter9.po.StudentMapper.findStudentByStuno";
        Student obj1=sqlSession.selectOne(query,2017010101);
        System.out.println(obj1);
        System.out.println("---------------------");
        query="chapter9.po.StudentMapper.findListStudent";
        Person p1=new Person("王五",2018020222);
        List<Student> lst=sqlSession.selectList(query,p1);
        for(Student each:lst){
            System.out.println(each);
        }


    }
}
