package com.java3;
import java.io.*;
public class Demo6 {

	public static void main(String[] args) throws IOException{
//		磁盘下创建文件
		// TODO Auto-generated method stub
File file=new File("E:/");
//创建过滤器对象
FilenameFilter filter=new FilenameFilter() {
	//实现accept()方法
	public boolean accept(File dir,String name) {
		File currFile=new File(dir,name);
		if(currFile.isFile()&&name.endsWith(".java")) {
			return true;
		}else {
			return false;
		}
	}
};
if(file.exists()) {//判断file对象对应的目录是否存在
	String[] lists=file.list(filter);//获得过滤后的所有文件名数组
	for(String name:lists) {
		System.out.println(name);
	}
}
	}

}
