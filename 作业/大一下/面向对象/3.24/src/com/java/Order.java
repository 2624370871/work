package com.java;

import java.util.Scanner;

public class Order {
	private String orderId;
	private OrderItem items[];
	public double total;
	public Order(String orderId) {
		this.orderId=orderId;
		this.items=new OrderItem[3];
	}
		// TODO 自动生成的构造函数存根
	public String getOrderId() {
		return orderId;
	}

	public OrderItem[] getItems() {
		return items;
	}

public static Order purchase(Demo2 books[]) {
	Order order=new Order("00001");
	OrderItem item=null;
	Scanner in=new Scanner(System.in);
	for (int i = 0; i <3; i++) {
		System.out.println("请输入图书编号选择图书");
		int cno=in.nextInt();
		System.out.println("请输入购买图书数量");
		int pnum=in.nextInt();
		item=new OrderItem(books[cno-1],pnum);
		order.setItem(item,i);
		System.out.println("请继续购买图书");
	}
	in.close();
	return order;
}
private void setItem(OrderItem item, int i) {
	// TODO 自动生成的方法存根
	
}
}
