package com.java;

public class Text {
public static void main(String[] args) {
	Animals a=new Animals("父类动物",1);
	Animals p=new Animals("子类动物",1);
	p.eat();
	a.eat();
}
}
