package com.java;

public class Supermarket {
	private String marketname;//私有化超市名称
	private Product[] producterarr;//私有化超市仓库，仓库里存放商品对象
	public String getMarketname() {//公有化获取超市名字的属性
		return marketname;//返回marketname的属性值
	}
	public void setMarketname(String marketname) {//公有化设置超市名字的属性
		this.marketname = marketname;//将形参marketname给当前类中的属性值marketname
	}
	public Product[] getProducterarr() {//公有化获取超市名字的属性
		return producterarr;//返回producterarr的属性值
	}
	public void setProducterarr(Product[] producterarr) {//公有化设置仓库的属性
		this.producterarr = producterarr;//将形参producterarr给当前类中的属性值producterarr
	}
	//售货
	Product sell(String name) {//遍历仓库中的每一个对象
		for (int i = 0; i < producterarr.length; i++) {
			//如果商品名称和想要买的商品名称一致
			if(producterarr[i].getProname()==name) {
				return producterarr[i];//返回超市仓库中的商品对象
			}
		}  
		return null;
	}
}
