package com.java;

class Product{
//	˽�л�
	private String Pcard;
	private String Pname;
	private String PType;
	private String Price;
	private String Pcode;
	private String PSell;
	private String Pnum;
//	�޲ι��췽��
	public Product() {
		
		
	}
//	�вι��췽��
	public Product(String Pcard,String Pname,String PType,String Price,
	String Pcode,String PSell,String Pnum) {
		this.Pcard=Pcard;
		this.Pname=Pname;
		this.PType=PType;
		this.Price=Price;
		this.Pcode=Pcode;
		this.PSell=PSell;
		this.Pnum=Pnum;
	}
	
	public String getPcard() {
		return Pcard;
	}
	public void setPcard(String pcard) {
		Pcard = pcard;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPType() {
		return PType;
	}
	public void setPType(String pType) {
		PType = pType;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getPcode() {
		return Pcode;
	}
	public void setPcode(String pcode) {
		Pcode = pcode;
	}
	public String getPSell() {
		return PSell;
	}
	public void setPSell(String pSell) {
		PSell = pSell;
	}
	public String getPnum() {
		return Pnum;
	}
	public void setPnum(String pnum) {
		Pnum = pnum;
	}
//	toString����
	public String toString() {
		return "���:"+this.Pcard+",����:"+this.Pname+",����:"+this.PType+",����:"+this.Price
		+",������:"+this.Pcode+",�Ƿ����:"+this.PSell+",�����:"+this.Pnum;
	}
}

