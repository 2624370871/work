package com.java1;
class Outer{
	int m=0;
	void test1() {
		System.out.println("外部类成员方法");
	}
	void test2() {
		class Inner{
			int n=1;
			void show() {
				System.out.println("外部成员变量m="+m);
				test1();
			}
		}
		Inner inner=new Inner();
		System.out.println("局部内部类变量n="+inner.n);
		inner.show();
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Outer outer=new Outer();
outer.test2();
	}

}
