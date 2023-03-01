package com.java;

public class Demo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
Demo2 stu1=new Demo2();
Demo2 stu2=new Demo2();
stu1.name="小明";
stu1.read();
stu2.name="小华";
stu2.read();
	}
}
class Demo2{
	String name;
	void read() {
		System.out.println("大家好，我是"+name);
	}
	
}
