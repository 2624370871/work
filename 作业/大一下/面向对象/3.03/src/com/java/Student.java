package com.java;

public class Student {
	String name;
	int age;
	int number;
public Student(String name, int age,int number){
    this.name = name;
    this.age = age;
    this.number=number;
}

public static void main(String[] args){
    Student student2 = new Student("张三",18,210403020);
    	System.out.println("我叫"+student2.name+"，今年"+student2.age+"岁了，我的学号是"+student2.number);
    }

}