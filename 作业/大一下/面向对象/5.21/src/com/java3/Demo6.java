package com.java3;
import java.util.Random;
public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(4);
		for(int x=0;x<10;x++){
			System.out.println(r.nextInt(100));
		}
	}

}
