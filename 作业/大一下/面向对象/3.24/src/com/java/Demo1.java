package com.java;
class animal{
	private String name;//定义name属性
	private int age;//定义age属性
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
}
}
//定义dog类继承animal类
class Dog extends animal{
	//此处不写代码
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		dog.setname("牧羊犬");
		dog.setage(3);
		System.out.println("名称："+dog.getname()+"，年龄："+dog.getage());
	}

}
