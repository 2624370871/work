package com.java;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ֵ������
		Member Member=new Member("����","��","2003-6-25","123456789",20,20,999,"2022-6-16");
		System.out.println(Member);
		Product Product = new Product("666", "���", "��ʳ", "3", "210403020", "��", "10");
		System.out.println(Product);
		Stock stock = new Stock(6, 6666, "���ȳ�", 123, "2022-6-16", "����");
		System.out.println(stock);
	}

}
