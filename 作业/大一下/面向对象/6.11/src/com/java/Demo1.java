package com.java;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();//创建mythread实例对象
		myThread.run();//调用mythread类的一个run()方法
		while(true){//该循环是一个死循环，打印输出语句
			System.out.println("main方法正在运行");
		}
	}

}
class MyThread{
	public void run(){
		while(true){//该循环是一个死循环，打印输出语句
			System.out.println("myThread类的run()方法在运行");
		}
	}
}