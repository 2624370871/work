package com.java;

class Animal1{
	String name="牧羊犬";
	void shout() {
		System.out.println("动物发出叫声");
	}
}
class Dog1 extends Animal1{
	public void shout() {
		super.shout();
		System.out.println("汪汪汪");
	}
	public void printName() {
		System.out.println("名字："+super.name);
	}
}
public class Demo2{
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.shout();
		dog.printName();
	}
}
