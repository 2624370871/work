package com.java3;

public class FourServiceShop {

	/**
	 * @param args
	 */
	public void sellCar(Car car){
		System.out.println("你选择的车型是:"+car.getName()+"，车的颜色是："+car.getColor()+"价格是："+car.getPrice()+"万元");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourServiceShop car=new FourServiceShop();
		car.sellCar(new BMW());
		car.sellCar(new Audi());
	}

}
