package com.java4;

interface Animal{
void shout();
}
public class Demo4 {

	public static void main(String[] args) {
		class Cat implements Animal{
			public void shout() {
				System.out.println("ίχίχ");
			}
		}
		animalShout(new Cat());
		}
		// TODO Auto-generated method stub
public static void animalShout(Animal an) {
	an.shout();
}
	} 

