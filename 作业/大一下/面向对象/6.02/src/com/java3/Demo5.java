package com.java3;
import java.io.*;
public class Demo5 {

	public static void main(String[] args) throws IOException{
//		磁盘下创建文件
		// TODO Auto-generated method stub
File file=new File("E:\\hello\\demo.txt");
if(file.exists()) {//如果存在文件就删除，否则就创建
	file.delete();
}else {
	System.out.println(file.createNewFile());
}
File fileDemo=new File("E:\\hello1\\demo.txt");//判断目录是否存在

if(!(fileDemo.getParentFile().exists())) {
	fileDemo.getParentFile().mkdir();
}
if(fileDemo.exists()) {
	fileDemo.delete();
}else {
	System.out.println(fileDemo.createNewFile());
}
	}

}
