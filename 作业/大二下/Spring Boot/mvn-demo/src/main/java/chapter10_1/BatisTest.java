package chapter10_1;

import chapter10_1.mapper.StudentMapper;
import chapter10_1.po.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.List;

public class BatisTest {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("chapter10_1_batis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

    public static void main(String[] args) {
        System.out.println("=======================");
        SqlSession sqlSession = getSession();
//        String query = "chapter10_1.mapper.StudentMapper.findStudentByStuno";
//        Student obj1 = sqlSession.selectOne(query, 2017010101);
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
//        Student obj2 = sqlSession.selectOne(query, 2017010101);
//        System.out.println(obj1);
//        System.out.println(obj2);

        System.out.println("第一次查询=========================");
        List<Student> data = mapper.findStudentByList();
        for (Student each:data){
            System.out.println(each);
        }

//        Student student=new Student(2020040540,"111",2020,"软件工程","移动应用开发");
//        int row = mapper.insertStudent(student);
//        sqlSession.commit();
//        System.out.println("影响的条数是:"+row);
//        mapper.insertStudent(student);
//        System.out.println("第二次查询=========================");
//        data=mapper.findStudentByList();
//        for (Student each:data){
//            System.out.println(each);
//        }


//        Student upst=new Student(2020040540,"王麻子",2020,"软件工程","移动应用开发");
//        int row = mapper.insertStudent(upst);
//        sqlSession.commit();
//        System.out.println("第二次查询=========================");
//        data=mapper.findStudentByList();
//        for (Student each:data){
//            System.out.println(each);
//        }

//        int row = mapper.deleteStudent(2017010101);
//        System.out.println(row);
        System.out.println("==================");
        Student upst=new Student(null,"宋",null,null,null);
                data=mapper.findStudentByName(upst);
        for (Student each:data){
            System.out.println(each);
        }
//        sqlSession.commit();

        sqlSession.close();
    }
}
