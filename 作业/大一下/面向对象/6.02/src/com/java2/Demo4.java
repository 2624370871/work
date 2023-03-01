package com.java2;
import java.io.*;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File file =new File("E:\\file");
if(file.isDirectory()) {//判断File对象对应的目录是否存在
	String[] names=file.list();//获取目录下所有文件的文件名
	for(String name:names) {
		System.out.println(name);
	}
}else {
	System.out.println("没有该目录");
}
	}

}
