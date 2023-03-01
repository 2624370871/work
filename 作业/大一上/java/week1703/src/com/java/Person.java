package com.java;

public class Person {//创建一个person类
	public Person() {
		System.out.println("早上吃了豆浆油条");
	}
private String name;//私有化处理string类型的对象
private int age;//私有化处理int类型的对象
private long num;//私有化处理long类型的对象
public String getName() {//公有化获取name值
	return name;//返回name值
}
public void setName(String name) {//公有化设置name的值
	this.name = name;//
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
public void eat() {
	System.out.println("早上吃了热干面");
}
}
