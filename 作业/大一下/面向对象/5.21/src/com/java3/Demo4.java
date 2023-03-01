package com.java3;
import java.util.Random;
public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
	}

}
