package com.java;

public class Demo4{
	String sNO;
	String sName;
	String sSex;
	String sAge;
	int sjava;
	
public Demo4(String sNo,String sName,String sSex,String sAge,int sjava){
	this.sNO = sNo;
	this.sName = sName;
	this.sSex = sSex;
	this.sAge = sAge;
	this.sjava = sjava;
}
public String getName() {
    return sName;
}

public String getNo() {

    return (sNO);
}

public String getSex() {
    return sSex;
}

public String getAge() {
    return sAge;
}

public int getJava() {
    return sjava;
}

public String toString(){
    return "学号:"+getNo()+",姓名:"+getName()+",性别:"+getSex()+",年龄:"+getAge()+",java成绩:"+getJava();
}


	public static void main(String[] args) {
		Demo4 stu1 = new Demo4("15","张三","女","19",89);
		Demo4 stu2 = new Demo4("11","李四","女","17",78);
		Demo4 stu3 = new Demo4("29","王五","男","18",97);
		Demo4 stu4 = new Demo4("16","赵六","女","18",70);
		Demo4 stu5 = new Demo4("19","孙七","男","19",80);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		System.out.println(stu4);
		System.out.println(stu5);
		int avg=stu1.sjava+stu2.sjava+stu3.sjava+stu4.sjava+stu5.sjava;
		System.out.println("平均成绩:"+avg/5);
		int a[]={89,92,70,88,96};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
		if(max<a[i]){
		max=a[i];
		}
		if(min>a[i]){
		min=a[i];
		}
		}
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
	}
}
