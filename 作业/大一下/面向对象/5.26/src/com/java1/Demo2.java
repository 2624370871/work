package com.java1;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		获取当前时间，包含毫秒
		LocalTime time=LocalTime.now();
		LocalTime of=LocalTime.of(9, 23,23);
		System.out.println("从LocalTime获取小时为"+time.getHour());
		System.out.println("从获取到的LocalTime实例格式化为："+time.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println("判断时间of是否在now之前："+of.isBefore(time));
		System.out.println("将时间字符串解析为时间对象后为："+LocalTime.parse("12:15:30"));
		System.out.println("从LocalTime获取当前时间，不包含毫秒"+time.withNano(0));
	}

}
