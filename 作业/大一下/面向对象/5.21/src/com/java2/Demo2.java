package com.java2;
import java.io.IOException;
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime rt=Runtime.getRuntime();
		Process process=rt.exec("notepad.exe");
		Thread.sleep(3000);
		process.destroy();
	}

}
