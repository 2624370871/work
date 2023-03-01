package com.java;

public class paybooks {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Demo2 books[]=new Demo2[3];
	outBooks(books);
	//Order order=purchase(books);
	//outOrder(order);
	}
public static void outBooks(Demo2 books[]) {
	 books[0]=new Demo2(1,"java教程",30.6,30);
	 books[1]=new Demo2(2,"jsp教程",42.1,40);
	 books[2]=new Demo2(3,"ssh架构",47.3,15);
	 System.out.println("\t图书列表");
	 System.out.println("图书编号\t图书名称\t图书单价\t库存数量");
	 System.out.println("---------------------------------------------------");
	 for (int i = 0; i < books.length; i++) {
		 System.out.println(i+1+"\t"+books[i].getName()+"\t"+books[i].getPrice()+"\t"+books[i].getStorage());
	}
	 System.out.println("-------------------------------------------");
 }
}
