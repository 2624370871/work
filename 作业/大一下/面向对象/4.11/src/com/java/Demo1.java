package com.java;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new Cat());
		show(new Dog());
		
		Animal a = new Cat();
		a.eat();
		Cat c = (Cat)a;
		c.work();
	}
	public static void show(Animal a) {
		a.eat();
		if (a instanceof Dog) {
			Dog c = (Dog)a;
			c.work();
		}
	}
}
abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat() {
		System.out.println("吃鱼");
	}
	public void work() {
		System.out.println("抓老鼠");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("吃骨头");
	}
	public void work() {
		System.out.println("看家");
	}
}
