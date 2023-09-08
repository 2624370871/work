package chapter10_1.po;

public class Student {
    private Integer stuno;
    private String stuname;
    private Integer grade;
    private String dept;
    private String classname;

    public Student(Integer stuno, String stuname, Integer grade, String dept, String classname) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.grade = grade;
        this.dept = dept;
        this.classname = classname;
    }

    public Integer getStuno() {
        return stuno;
    }
    public void setStuno(Integer stuno) {
        this.stuno = stuno;
    }
    public String getStuname() {
        return stuname;
    }
    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
    public Integer getGrade() {
        return grade;
    }
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getClassname() {
        return classname;
    }
    public void setClassname(String classname) {
        this.classname = classname;
    }
    @Override
    public String toString() {
        String result = String.format("id=%s, name=%s, grade=%s, dept=%s, classname=%s",
                this.stuno, this.stuname, this.grade, this.dept, this.classname);
        return result;
    }
}
