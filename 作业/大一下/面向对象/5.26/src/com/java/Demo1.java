package com.java;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		获取日期时分秒
		LocalDate now=LocalDate.now();
		LocalDate of=LocalDate.of(2015, 12, 12);
		System.out.println("1.LocalDate的获取及格式化的相关方法------");
		System.out.println("从LocalDate实例获取的年份为："+now.getYear());
		System.out.println("从LocalDate实例获取的月份为："+now.getMonthValue());
		System.out.println("从LocalDate实例获取当天在本月的第几天："+now.getDayOfMonth());
		System.out.println("将获取到的LocalDate实例格格式化为："+now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日")));
		System.out.println("2.LocalDate判断的相关方法-------");
		System.out.println("判断日期of是否在now之前："+of.isBefore(now));
		System.out.println("判断日期of是否在now之后："+of.isAfter(now));
		System.out.println("判断日期of和now是否相等："+of.equals(of));
		System.out.println("判断日期of是否是闰年："+of.isLeapYear());
//给出一个符合默认个格式要求的日期字符串符串
		System.out.println("3.LocalDate解析以及加减操作的相关方法------");
		String dateStr="2020-02-01";
		System.out.println("把日期字符串解析成日期对象后为："+LocalDate.parse(dateStr));
		System.out.println("将LocalDate实例年份加1为"+now.plusYears(1));
		System.out.println("将LocalDate实例天数减10为"+now.minusDays(10));
		System.out.println("将LocalDate实例指定年份为2014"+now.withYear(2014));
	}

}
