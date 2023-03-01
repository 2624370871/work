package com.java;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="itcast";
		System.out.println("将it替换成cn.it的结果"+s.replace("it", "cn.it"));
		String s1="    i t c a s t    ";
		System.out.println("去除字符串两端的空格"+s.trim());
		System.out.println("去除字符串中所有空格后的结果"+s.replace(" ", ""));
	}

}
