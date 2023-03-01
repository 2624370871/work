package com.java;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
int num=0;
int guessnum=(int)(Math.random()*101);
System.out.println(guessnum);
int count=0;
Scanner sc=new Scanner(System.in);
while (true) {
	System.out.println("请输入数字");
	num=sc.nextInt();
	count++;
	if(num==guessnum) {
		System.out.println("答对啦");break;
	}if(num>guessnum) {
		System.out.println("大了");
	}else {
		System.out.println("小了");
	}
}
	}

}
