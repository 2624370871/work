package com.java2;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("计算绝对值的结果"+Math.abs(-1));
		System.out.println("求大于参数的最小整数"+Math.ceil(5.6));
		System.out.println("求小于参数的最大整数"+Math.floor(-4.2));
		System.out.println("求小数进行四舍五入后的结果"+Math.round(-4.6));
		System.out.println("求两个数的较大值"+Math.max(2.1,-2.1));
		System.out.println("求两个数的较小值"+Math.min(2.1,-2.1));
		System.out.println("生成一个大于等于0小于1的随机值"+Math.round(Math.random()*100));
	}

}
