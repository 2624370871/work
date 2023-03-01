package com.java;


public class Wuze {
	public static void main(String[] args) {
		Product p1=new Product();//创建商品对象1
		Product p2=new Product();//创建商品对象2
		Product p3=new Product();//创建商品对象3
		Product p4=new Product();//创建商品对象4
		Product p5=new Product();//创建商品对象5
		p1.setProname("碎冰冰");//调用商品对象中的设置商品名称方法为其赋值：碎冰冰
		p2.setProname("旺仔");//调用商品对象中的设置商品名称方法为其赋值：旺仔
		p3.setProname("卫龙辣条");//调用商品对象中的设置商品名称方法为其赋值：卫龙辣条
		p4.setProname("薯片");//调用商品对象中的设置商品名称方法为其赋值：薯片
		p5.setProname("饼干");//调用商品对象中的设置商品名称方法为其赋值：饼干
	Supermarket suma1=new Supermarket();//创建超市对象1
	Supermarket suma2=new Supermarket();//创建超市对象2
	suma1.setMarketname("学府超市");//调用超市对象1中的设置超市名称方法为其赋值：学府超市
	suma1.setProducterarr(new Product[] {p1,p3,p5});//给超市仓库赋值
	suma2.setMarketname("沃尔玛");//调用超市对象2中的设置超市名称方法为其赋值：沃尔玛
	suma2.setProducterarr(new Product[] {p2,p4});//给超市仓库赋值
	Person pe1 = new Person();//创建购买者对象1
	Person pe2 = new Person();//创建购买者对象2
	pe1.setPnanme("吴泽");//调用购买者对象1中的设置人的名字方法为其赋值：吴泽
	pe2.setPnanme("欧阳鹏");//调用购买者对象2中的设置人的名字方法为其赋值：欧阳鹏
	Product result=pe1.shoppings(suma1, "卫龙辣条");//定义一个product类的result，并将购买结果赋值给result
	if(result!=null) {//判断result是否等于null，如果是，则输出买到的结果，否则输出没买到的结果
		System.out.println(pe1.getPnanme()+"在"+suma1.getMarketname()+"买到了"+result.getProname());
	}else {
		System.out.println(pe1.getPnanme()+"在"+suma1.getMarketname()+"没买到东西");
	}
	Product result1=pe2.shoppings(suma2, "碎冰冰");//定义一个product类的result1，并将购买结果赋值给result1
	if(result1!=null) {//判断result1是否等于null，如果是，则输出买到的结果，否则输出没买到的结果
		System.out.println(pe2.getPnanme()+"在"+suma2.getMarketname()+"买到了"+result.getProname());
	}else {
		System.out.println(pe2.getPnanme()+"在"+suma2.getMarketname()+"没买到东西");
	}
	}
}
