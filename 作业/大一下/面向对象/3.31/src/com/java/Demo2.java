package com.java;

class Animal1{
	String name="����Ȯ";
	void shout() {
		System.out.println("���﷢������");
	}
}
class Dog1 extends Animal1{
	public void shout() {
		super.shout();
		System.out.println("������");
	}
	public void printName() {
		System.out.println("���֣�"+super.name);
	}
}
public class Demo2{
	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.shout();
		dog.printName();
	}
}
