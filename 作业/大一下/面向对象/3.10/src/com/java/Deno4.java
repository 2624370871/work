package com.java;

import java.util.Scanner;

public class Deno4 {
	public static void main(String[] args) {
		int[]list=new int[] {8,4,2,1,23,34,50};
		int sum=0;
		for(int num: list) {
		System.out.println(num);sum+=num;
		}
		System.out.println("数组元素之和为:"+sum) ;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int guess=input.nextInt();
		boolean isCorrect = false;
		for (int i = 0; i < list.length; i++){
		if (guess==list[i]){
		isCorrect = true;break;
		}
		}
		if (isCorrect) {
		System.out.println("猜对了");}else {
		System.out.println( "sorry" );
		}
	}
}