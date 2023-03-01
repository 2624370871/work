package com.java;
import java.time.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		LocalDate birthday=LocalDate.of(2018,5,2);
		LocalDate now=LocalDate.now();
		Period between=Period.between(birthday, now);
		System.out.println("时间间隔为："+between.getYears()+"年");	
		System.out.println("时间间隔为："+between.getMonths()+"月");
		System.out.println("时间间隔为："+between.getDays()+"日");		
	}

}
