package com.java;

class Stock{
//	˽�л�
	private int Scard;
	private int Scode;
	private String Sname;
	private int Scount;
	private String Sday;
	private String Sperson;
//	�޲ι��췽��
	public Stock() {
		
	}
//	�вι��췽��
	public Stock(int Scard,int Scode,String Sname,int Scount,
	String Sday,String Sperson) {
		this.Scard=Scard;
		this.Scode=Scode;
		this.Sname=Sname;
		this.Scount=Scount;
		this.Sday=Sday;
		this.Sperson=Sperson;
	}
	
	public int getScard() {
		return Scard;
	}
	public void setScard(int scard) {
		Scard = scard;
	}
	public int getScode() {
		return Scode;
	}
	public void setScode(int scode) {
		Scode = scode;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getScount() {
		return Scount;
	}
	public void setScount(int scount) {
		Scount = scount;
	}
	public String getSday() {
		return Sday;
	}
	public void setSday(String sday) {
		Sday = sday;
	}
	public String getSperson() {
		return Sperson;
	}
	public void setSperson(String sperson) {
		Sperson = sperson;
	}
//	toString����
	public String toString() {
		return "�������:"+this.Scard+",��Ʒ���:"+this.Scode+",��Ʒ����:"+this.Sname+
		",��������:"+this.Scount+",��������:"+this.Sday+",������:"+this.Sperson;
	}
}


