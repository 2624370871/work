package com.java;

public class Wuze {
private String proname;//对商品属性进行私有化处理

public String getProname(){//对商品属性进行公有化获取
	return proname;//将私有化的proname属性值返回
}

public void setProname(String proname) {//对商品属性进行公有化设置
	this.proname = proname;//将形参proname值给当前类中的proname值
}
}
