package com.java3;

import javax.print.DocFlavor.STRING;

public class Demo4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "ababcdedcba";
		System.out.println("字符串长度为:"+s.length());
		System.out.println("字符串中第一个字符:"+s.charAt(0));
		System.out.println("字符c第一次出现的位置:"+s.indexOf('c'));
		System.out.println("字符串长c最后一次出现的位置:"+s.lastIndexOf('c'));
		System.out.println("子字符串第一次出现的位置:"+s.indexOf("ab"));
		System.out.println("子字符串最后一次出现的位置:"+s.lastIndexOf("ab"));
	}

}
