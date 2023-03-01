package com.java2;
class Outer{
	static int m=0;
	static class Inner{
		int n=1;
		void show() {
			System.out.println("外部静态变量m="+m);
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner innner = new Outer.Inner();
		innner.show();
	}

}

