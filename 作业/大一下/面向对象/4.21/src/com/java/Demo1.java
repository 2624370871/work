package com.java;
interface Animal{
	String ANIMAL_ACTIVE="动物的行为";
	void breath();
	void run();
}
class Dog implements Animal{
	public void breath() {
		System.out.println(ANIMAL_ACTIVE+":"+"狗在呼吸");
	}
	public void run() {
		System.out.println(ANIMAL_ACTIVE+":"+"狗在奔跑");
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.breath();
		dog.run();
	}

}
