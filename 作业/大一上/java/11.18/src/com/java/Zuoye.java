package com.java;

public class Zuoye {

	public static void main(String[] args) {//运行主程序
		abc(4,7,1);//调用方法abc，将4,7,1分别传递给a，b，c
		abc(4,6,-1);//调用方法abc，将4,6,-1分别传递给a，b，c
		abc(4,5,-3);//调用方法abc，将4,7,-3分别传递给a，b，c
		xyz(5,4,6);//调用方法xyz，将5,4,6分别传递给x,y,z
		}
		public static void abc(int a,int b,int c) {//接受传递的值，分别存放在a，b，c中
			for(int i=1;i<=a;i++) {//执行for循环
				for(int j=1;j<b-i;j++) {//执行嵌套循环中的第一个for循环
					System.out.print(" ");//输出空格
				}
				for(int j=1;j<=2*i-c;j++) {//执行嵌套循环中的第二个for循环
					System.out.print("*");//输出*号
				}
				System.out.println("");//换行，并自加一循环输出结果
			}
		}//直到循环结束，跳出循环
			public static void xyz(int x,int y,int z) {//接受传递的值，分别存放在x,y,z中
				for(int i=1;i<=x;i++) {//执行for循环
					for(int j=1;j<y;j++) {//执行嵌套循环中的第一个for循环
						System.out.print(" ");//输出空格
					}
					for(int j=1;j<z;j++) {//执行嵌套循环中的第二个for循环
						System.out.print("*");//输出*号
					}
					System.out.println("");//换行，并自加一循环输出结果
		}
	}//直到循环结束，跳出循环

}
