package com.java;

class Stock{
//	私有化
	private int Scard;
	private int Scode;
	private String Sname;
	private int Scount;
	private String Sday;
	private String Sperson;
//	无参构造方法
	public Stock() {
		
	}
//	有参构造方法
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
//	toString方法
	public String toString() {
		return "进货编号:"+this.Scard+",商品编号:"+this.Scode+",商品名称:"+this.Sname+
		",进货数量:"+this.Scount+",进货日期:"+this.Sday+",供货商:"+this.Sperson;
	}
}


