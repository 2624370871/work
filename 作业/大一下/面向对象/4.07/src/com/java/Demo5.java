package com.java;
interface Animal1{
	int ID=1;
	String NAME = "����Ȯ";
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
		System.out.println("ϲ���Թ�ͷ");
	}
	public void shout() {
		System.out.println("����...");
	}
	public void info() {
		System.out.println("����"+NAME);
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���"+Animal1.getID());
		Dog1 dog = new Dog1();
		dog.info();
		dog.shout();
		dog.eat();
	}

}
