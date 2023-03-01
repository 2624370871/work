package com.java;

public class Demo1 {
private static final int TIMES=10000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.testString();
		Demo1.testStringBuffer();
		Demo1.testStringBuilder();
		}
//	String时间效率测试
	public static void testString() {
		long startTime=System.currentTimeMillis();
		String str="";
		for (int i = 0; i <TIMES; i++) {
			str+="test";
		}
		long endTime=System.currentTimeMillis();
		System.out.println("String test usedtime:"+(endTime-startTime));
	}
//	StringBuffer时间效率测试（线程安全）
	public static void testStringBuffer() {
		long startTime=System.currentTimeMillis();
		StringBuffer str=new StringBuffer();
		for (int i = 0; i <TIMES; i++) {
			str.append("test");
		}
		long endTime=System.currentTimeMillis();
		System.out.println("StringBuffer test usedtime:"+(endTime-startTime));
	}
//	StringBuilder时间效率测试（非线程安全）
	public static void testStringBuilder() {
		long startTime=System.currentTimeMillis();
		StringBuilder str=new StringBuilder();
		for (int i = 0; i <TIMES; i++) {
			str.append("test");
		}
		long endTime=System.currentTimeMillis();
		System.out.println("StringBuilder test usedtime:"+(endTime-startTime));
	}
}
