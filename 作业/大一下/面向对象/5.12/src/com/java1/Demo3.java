package com.java1;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="羽毛球-篮球-乒乓球";
		System.out.println("从第五个字符串截取到末尾的结果:"+str.substring(4));
		System.out.println("从第五个字符截取到第六个字符的结果:"+str.substring(4,6));
		System.out.println("分割后的字符串数组中的元素依次为:");
		String[] strArray=str.split("-");
		for (int i = 0; i < strArray.length; i++) {
			if (i!=strArray.length-1) {
				System.out.print(strArray[i]+",");
			}else {
				System.out.println(strArray[i]);
			}
		}
	}

}
