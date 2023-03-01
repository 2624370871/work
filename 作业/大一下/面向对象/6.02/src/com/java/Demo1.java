package com.java;

import java.time.Duration;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime start=LocalTime.now();
		LocalTime end=LocalTime.of(20, 13,23);
		Duration duration=Duration.between(start, end);
//		间隔的时间
		System.out.println("时间间隔为："+duration.toNanos()+"纳秒");	
		System.out.println("时间间隔为："+duration.toMillis()+"毫秒");
		System.out.println("时间间隔为："+duration.toHours()+"小时");		
	}

}
