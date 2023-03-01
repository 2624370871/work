package com.java;

public class Animals {
private String Name;
private int Id;
public Animals(String myName,int myId) {
	Name=myName;
	Id=myId;
}
public void eat() {
	System.out.println(Name+"正在吃");
}
public void sleep() {
	System.out.println(Id+"正在睡");
}
public void introduction() {
	System.out.println("大家好！我是"+Id+"号"+Name);
}
}
