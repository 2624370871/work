package com.java;
interface Animal1{
	int ID=1;
	String NAME = "ÄÁÑòÈ®";
	void shout();
	static int getID() {
		return Animal1.ID;
	}
	public void info();
}
interface Action{
	public void eat();
}
class Dog1 implements Animal1,Action{
	public void eat() {
		System.out.println("Ï²»¶³Ô¹ÇÍ·");
	}
	public void shout() {
		System.out.println("ÍôÍô...");
	}
	public void info() {
		System.out.println("Ãû³Æ"+NAME);
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("±àºÅ"+Animal1.getID());
		Dog1 dog = new Dog1();
		dog.info();
		dog.shout();
		dog.eat();
	}

}
