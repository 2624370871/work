package com.java1;


interface Animal{
	String ANIMAL_ACTIVE="动物的行为";
	void breath();
	void run();
}
interface landAnimal extends Animal{
	void liveOnload();
}
class Dog implements landAnimal{
		public void breath() {
			System.out.println(ANIMAL_ACTIVE+":"+"狗在呼吸");
		}
		public void run() {
			System.out.println(ANIMAL_ACTIVE+":"+"狗在奔跑");
		}
		public void liveOnload() {
			System.out.println("狗是动物");
		}
	}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.breath();
		dog.run();
		dog.liveOnload();
	}

}
