package com.java3;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now=LocalDateTime.now();
		System.out.println("获取当前日期时间："+now);
		System.out.println("将目标LocalDateTime转换为相应的LocalDate实例"+now.toLocalDate());
		System.out.println("将目标LocalDateTime转换为相应的LocalTime实例"+now.toLocalTime());
//		指定格式
		DateTimeFormatter ofPattern =DateTimeFormatter.ofPattern("yyyy年MM月dd日mm分ss秒");
		System.out.println("格式化后的日期时间为："+now.format(ofPattern));
	}

}
