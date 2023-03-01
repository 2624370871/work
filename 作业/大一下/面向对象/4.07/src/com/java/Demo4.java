package com.java;

abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{
	void shout() {
		System.out.println("ÍôÍô");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.shout();
	}

}
