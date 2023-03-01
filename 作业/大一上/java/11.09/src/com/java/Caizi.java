package com.java;

import java.util.Scanner;

public class Caizi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 猜字游戏
		
		int nummber =(int)(Math.random()*10+1);//随机数生成，Math.random()代表[0,1),乘以十，扩大十倍
			int guess;
			//int nummber=17;
			System.out.println(nummber);//生成的随机数显示
			System.out.println("请输入一个随机数");
			do {
				Scanner sc = new Scanner(System.in);
				guess = sc.nextInt();
				if (guess > nummber) {
					System.out.println("输入的值过大！");
				} else if (guess < nummber) {
					System.out.println("输入的值过小！");

				}
			} while (nummber != guess);
			System.out.println("恭喜你！猜中了！" + nummber);
	}

	}

