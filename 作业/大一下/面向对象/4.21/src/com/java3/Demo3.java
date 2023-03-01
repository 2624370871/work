package com.java3;
interface Animal{
void shout();
}

public class Demo3 {
public static void main(String[] args) {
	String name="Π‘»¨";
	animalShout(new Animal() {
		@Override
		public void shout() {      
			System.out.println(name+"ίχίχ");
		}
	});
}
public static void animalShout(Animal an) {
	an.shout();
}
}
