package com.java;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		赋值并调用
		Member Member=new Member("张三","男","2003-6-25","123456789",20,20,999,"2022-6-16");
		System.out.println(Member);
		Product Product = new Product("666", "面包", "面食", "3", "210403020", "是", "10");
		System.out.println(Product);
		Stock stock = new Stock(6, 6666, "火腿肠", 123, "2022-6-16", "张三");
		System.out.println(stock);
	}

}
