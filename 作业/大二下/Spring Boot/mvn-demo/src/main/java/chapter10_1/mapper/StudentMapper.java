package chapter10_1.mapper;

import chapter10_1.po.Student;

import java.util.List;

public interface StudentMapper {
    Student findStudentByStuno(int id);
    List<Student> findStudentByList();
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(int id);
    List<Student>findStudentByName(Student student);
    List<Student>findStudentByLike(Student student);
}
