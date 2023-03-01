package com.java;


public class Person {
		private String pnanme;//将买东西的人的属性进行私有化处理

		public String getPnanme() {//公有化获取pname的属性
			return pnanme;//返回pname的值
		}

		public void setPnanme(String pnanme) {//公有化设置pname的属性值
			this.pnanme = pnanme;//将形参pname给当前类中的属性值pname
		}	
		Product shoppings(Supermarket sumar,String name) {
			return sumar.sell(name);
			
		}
}
