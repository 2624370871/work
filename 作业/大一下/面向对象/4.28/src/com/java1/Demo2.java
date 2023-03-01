package com.java1;
class Animal{
	public void shout() {
		System.out.println("动物叫....");
	}
}
//Dog类
class Dog extends Animal{
	//重写shout()方法
	public void shout() {
		System.out.println("汪汪");
	}
	public void eat() {
		System.out.println("吃骨头");
	}
}
//定义测试类
public class Demo2 {
public static void main(String[] args) {
	Animal a1=new Dog();//通过向上转型实例化Animal对象
	System.out.println("Animal a1=new Dog():"+(a1 instanceof Animal));
	System.out.println("Animal a1=new Dog():"+(a1 instanceof Dog));
	Animal a2=new Animal();//实例化Animal对象
	System.out.println("Animal a1=new Dog():"+(a2 instanceof Animal));
	System.out.println("Animal a1=new Dog():"+(a2 instanceof Dog));
}
}
