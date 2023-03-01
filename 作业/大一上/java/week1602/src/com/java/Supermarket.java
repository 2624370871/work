package com.java;

public class Supermarket {
private String marketname;//私有化超市名称
private Wuze[] producterarr;//私有化超市仓库，仓库里存放商品对象
public String getMarketname() {
	return marketname;
}
public void setMarketname(String marketname) {
	this.marketname = marketname;
}
public Wuze[] getProducterarr() {
	return producterarr;
}
public void setProducterarr(Wuze[] producterarr) {
	this.producterarr = producterarr;
}
//售货
Wuze sell(String name) {//遍历仓库中的每一个对象
	for (int i = 0; i < producterarr.length; i++) {
		//如果商品名称和想要买的商品名称一致
		if(producterarr[i].getProname()==name) {
			return producterarr[i];
		}
	}
	return null;
}
}
