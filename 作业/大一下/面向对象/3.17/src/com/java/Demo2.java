package com.java;

class Student {
String name;
{
	System.out.println("构造代码块");
}
public Student() {
	System.out.println("Demo2类的构造方法");
}
}
public class Demo2{
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
	}
}
