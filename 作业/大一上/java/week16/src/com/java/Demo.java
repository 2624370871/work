package com.java;

public class Demo {
private String name;
private String classes;
private String tel;
private long num;
private int age;
public void jieshao() {
	System.out.println("大家好"+",我叫"+name+"，我的学号是"+num+",我来自"+classes+"班，我的联系方式是"+tel);
}
public void age() {
	System.out.println("我今年"+age+"岁");
}
//公有化获取name的值
public String getName() {
	return name;//将私有化的name属性值返回
}
//公有化设置name的值
public void setName(String name) {
	this.name = name;//将形参name值给当前类中的name属性
}
//公有化获取classes的值
public String getClasses() {
	return classes;//将私有化的classes属性值返回
}
//公有化设置classes的值
public void setClasses(String classes) {
	this.classes = classes;//将形参classes值给当前类中的classes属性
}
//公有化获取tel的值
public String getTel() {
	return tel;//将私有化的tel属性值返回
}
//公有化设置tel的值
public void setTel(String tel) {
	this.tel = tel;//将形参tel值给当前类中的tel属性
}
//公有化获取num的值
public long getNum() {
	return num;//将私有化的num属性值返回
}
//公有化设置num的值
public void setNum(long num) {
	this.num = num;//将形参num值给当前类中的num属性
}
//公有化获取age的值
public int getAge() {
	return age;//将私有化的age属性值返回
}
//公有化设置age的值
public void setAge(int age) {
	if(age<=0) {
		System.out.println("您输入的年龄有误");
	}else {
	this.age = age;//将形参age值给当前类中的age属性
	}
}
}
