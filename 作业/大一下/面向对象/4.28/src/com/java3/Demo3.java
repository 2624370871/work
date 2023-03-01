package com.java3;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divide(4, 0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("异常信息为" + e.getMessage());
			return;// 用于结束当前语句
		} finally {
			System.out.println("进入finally代码块");
		}
		System.out.println("程序继续执行");
	}

	public static int divide(int x, int y) {
		int result = x / y;
		return result;
	}
}
