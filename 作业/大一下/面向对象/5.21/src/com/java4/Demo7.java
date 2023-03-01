package com.java4;
import java.time.*;
public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant now=Instant.now();
		System.out.println("从系统获取的当前时刻为："+now);
		Instant instant=Instant.ofEpochMilli(1000*60*60*24);
		System.out.println("计算机元年增加毫秒数后为："+instant);
		Instant instantl=Instant.ofEpochSecond(60*60*24);
		System.out.println("计算机元年增加毫秒数后为："+instantl);
		System.out.println("获取的秒值为："+Instant.parse("2007-12-03T10:15:30.44Z").getEpochSecond());
		System.out.println("获取的纳秒值为："+Instant.parse("2007-12-03T10:15:30.44Z").getNano());
		System.out.println("从时间对象获取的Instant实例为:"+Instant.from(now));
	}

}
