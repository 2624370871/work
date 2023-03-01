package com.java2;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int result=divide(4,-2);
	System.out.println(result);
}catch(Demo3 e) {
	System.out.println(e.getMessage());
}
	}
public static int divide(int x,int y) throws Demo3{
	if(y<0) {
		throw new Demo3("除数是负数");
	}
	int result =x/y;
	return result;
}
}
