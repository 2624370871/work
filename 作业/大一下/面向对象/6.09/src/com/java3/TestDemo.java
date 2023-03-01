package com.java3;
class Person{
	private String name;
	private String address;
	private char sex;
	private int age;
	public Person() {
	}
	public Person(String name,String address,char sex,int age) {
		super();
		this.name=name;
		this.address=address;
		this.sex=sex;
		this.age=age;
	}
	public String toString() {
		return "姓名"+this.name+"地址:"+this.address+"性别:"+this.sex+"年龄:"+this.age;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected char getSex() {
		return sex;
	}
	protected void setSex(char sex) {
		this.sex = sex;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
}
class Student extends Person{
	private double math;
	private double english;
	public Student() {}
	public Student(String name,String address,char sex,int age,double math,double english) {
		super(name,address,sex,age);
		this.math=math;
		this.english=english;
	}
	public String toString() {
		return super.toString()+"数学成绩:"+this.math+"英语成绩:"+this.english;
	}
	protected double getMath() {
		return math;
	}
	protected void setMath(double math) {
		this.math = math;
	}
	protected double getEnglish() {
		return english;
	}
	protected void setEnglish(double english) {
		this.english = english;
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student stu = new Student("张三","湖北科技职业学院",'男',18,99.3,80.5);
		System.out.println(stu);

	}

}
