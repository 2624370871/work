package com.java2;


public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread=new MyThread();//创建线程MyThread的线程对象
		Thread thread =new Thread(myThread);
		thread.start();//开启线程
		while(true){//通过死循环语句打印输出
			System.out.println("main()方法在运行");
		}
	}

}
class MyThread implements Runnable{
	public void run(){
		while(true){
			System.out.println("MyThread类的run（）方法在运行");
		}
	}
}
