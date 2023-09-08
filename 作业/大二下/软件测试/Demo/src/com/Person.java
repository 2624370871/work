package com;

public class Person {		
	String name;//姓名	
	int age;//年龄	
	String sex;//身高	
	String no;//电话号码	
	int[] heigwei;//身高体重	
	String code;//其他属性
	public Person(String namec, int agec, String sexc, String noc, String codec, int... heigweic) {
	    name = namec;
	    age= agec;
	    sex = sexc;
	    no = noc;
	    code = codec;
	    heigwei = heigweic;		
	}
	//获取名称
	public String getName() {
	    return name;		
	}
	//获取年龄
	public int getAge() {
	    return age;
	}
	//获取性别
	public int getSex() {
	    if(sex=="男") {
	    	return 1;
	    }else {
	    	return 0;
	    }
	}
	//获取其他属性
	public String getCode(){
	    return code;
	}
	//获取电话号码
	public String getNo(){
	    return no;
	}
	//获取身高体重
	public int[] getHeigwei() {
	    return heigwei;
	}	
}