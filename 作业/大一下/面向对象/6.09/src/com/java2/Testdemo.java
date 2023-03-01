package com.java2;
class Account{
	private String name;
	private double balance;
	public Account() {
		
	}
	public Account(String name,double balance) {
		super();
		this.name=name;
		this.balance=balance;
	}
	public String toString() {
		return "账户名称："+this.name+"，余额"+this.balance;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account("张三",5000.0);
		System.out.println(acc);
		System.out.println("账户余额："+acc.getBalance());
	}

}
