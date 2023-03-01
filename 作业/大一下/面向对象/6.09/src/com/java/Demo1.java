package com.java;

import java.io.File;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("D:\\hello\\test");
				if(file.exists()) {
					System.out.println(file.delete());
				}
	}

}
