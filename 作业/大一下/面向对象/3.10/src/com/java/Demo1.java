package com.java;

public class Demo1 {
	public static void main(String[] args) {
		getArea(3,5);
	}
public static int getArea( int x, int y){
		int temp = x * y;
		System.out.println("矩形的面积为"+temp);
		return temp;
}
}