package com.java;

public class Member {
//	私有化
	private String name;
	private String sex;
	private String borndata;
	private String phone;
	private int Membernum;
	private int Cardnum;
	private int score;
	private String logindata;
//	无参构造方法
	public Member() {
		
	}
//	有参构造方法
	public Member(String name,String sex,String borndata,String phone,int Membernum,int Cardnum,int score,String logindata) {
		super();
		this.name=name;
		this.sex=sex;
		this.borndata=borndata;
		this.phone=phone;
		this.Membernum=Membernum;
		this.Cardnum=Cardnum;
		this.score=score;
		this.logindata=logindata;
		
	}
//	tostring方法
	public String toString() {
		return "会员姓名："+this.name+",性别："+
	this.sex+",出生日期："+this.borndata+",联系方式："+
	this.phone+",会员编号："+this.Membernum+",卡号："+
	this.Cardnum+",积分："+this.score+",注册日期:"+
	this.logindata;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBorndata() {
		return borndata;
	}
	public void setBorndata(String borndata) {
		this.borndata = borndata;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMembernum() {
		return Membernum;
	}
	public void setMembernum(int membernum) {
		Membernum = membernum;
	}
	public int getCardnum() {
		return Cardnum;
	}
	public void setCardnum(int cardnum) {
		Cardnum = cardnum;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getLogindata() {
		return logindata;
	}
	public void setLogindata(String logindata) {
		this.logindata = logindata;
	}
	
}