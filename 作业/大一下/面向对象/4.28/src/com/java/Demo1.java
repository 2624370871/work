package com.java;
class Animal{
	public String show(LDog obj) {
		return ("Animal and LDog");
	}
	public String show(Animal obj) {
		return ("Animal and Animal");
	}
}
class Dog extends Animal{
	public String show(Dog obj) {
		return ("Dog and Dog");
	}
	public String show(Animal obj) {
		return ("Dog and Animal");
	}
}
class BDog extends Dog{
	
}
class LDog extends Dog{
	
}
public class Demo1 {
public static void main(String[] args) {
	Animal a1=new Animal();
	
	Animal a2=new Dog();
	
	Dog b=new Dog();
	BDog c=new BDog();
	LDog d=new LDog();
	
	System.out.println("1--"+a1.show(b));
	System.out.println("2--"+a1.show(c));
	System.out.println("3--"+a1.show(d));
	System.out.println();
	
	System.out.println("4--"+a2.show(b));
	System.out.println("5--"+a2.show(c));
	System.out.println("6--"+a2.show(d));
	System.out.println();
	
	System.out.println("7--"+b.show(b));
	System.out.println("8--"+b.show(c));
	System.out.println("9--"+b.show(d));
}
}
