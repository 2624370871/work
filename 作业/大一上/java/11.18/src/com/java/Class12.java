package com.java;

public class Class12 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=6-i;j++) {
//				System.out.print(" ");
//			}
//			for(int z=1;z<=2*i-1;z++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int z=1;z<=2*i+1;z++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4-i;j++) {
//				System.out.print(" ");
//			}
//			for(int z=1;z<=2*i+3;z++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<5;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<4;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
	abc(4,7,1);
	abc(4,6,-1);
	abc(4,5,-3);
	xyz(5,4,5);
	}
	public static void abc(int a,int b,int c) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<b-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<2*i-c;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
		public static void xyz(int x,int y,int z) {
			for(int i=1;i<=x;i++) {
				for(int j=1;j<y;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<z;j++) {
					System.out.print("*");
				}
				System.out.println("");
	}
		}
}
