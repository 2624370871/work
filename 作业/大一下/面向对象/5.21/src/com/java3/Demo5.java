package com.java3;
import java.util.*;
public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1=new Random();
		System.out.println("产生float类型随机数"+r1.nextFloat());
		System.out.println("产生0~100之间int类型随机数"+r1.nextInt(100));
		System.out.println("产生double类型的随机数"+r1.nextDouble());
	}

}
