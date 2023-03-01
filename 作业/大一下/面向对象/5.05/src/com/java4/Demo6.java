package com.java4;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="abcd";
System.out.print("将字符串转为字符串数组后的结果：");
char[] charArray=str.toCharArray();
for(int i=0;i<charArray.length;i++) {
	if(i!=charArray.length-1) {
		System.out.print(charArray[i]+",");
	}else {
		System.out.println(charArray[i]);
	}
	
}
System.out.println("将int值转换为String类型后的结果："+String.valueOf(12));
System.out.println("将字符串转为大写之后的结果："+str.toUpperCase());
	}

}
