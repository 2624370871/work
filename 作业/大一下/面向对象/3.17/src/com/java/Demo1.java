package com.java;

public class Demo1 {
	String name;
	int age;
	static String school="A大学";
	public Demo1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void info() {
		System.out.println("姓名："+this.name+"，年龄"+this.age+"，学校"+school);
	}
		public static void main(String[] args) {
			Demo1 stu1=new Demo1("张三",18);
			Demo1 stu2=new Demo1("李四",19);
			Demo1 stu3=new Demo1("王五",20);
			stu1.school="B大学";
			stu1.info();
			stu2.info();
			stu3.info();
		}
	}
