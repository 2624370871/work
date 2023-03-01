package com.java2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dates = "1981-09-19 09:07:27.727";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		Date d2;
		try {
			d2 = df2.parse(dates);
			System.out.println(df2.format(d2));
		}catch(Exception ex) {
			
		}
	}

}
