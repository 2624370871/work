package com.java;
class Animal{
	void shout() {
		System.out.println("���﷢������");
	}
}
class Dog extends Animal{
	void shout() {
		System.out.println("������");
	}
}
public class Demo1 {
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.shout();
}
}
