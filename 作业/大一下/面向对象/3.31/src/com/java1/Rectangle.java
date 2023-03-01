package com.java1;

public class Rectangle extends Shape{
private double height;
private double width;
public Rectangle() {
	super();
	this.height=1.0;
	this.width=1.0;
}
public Rectangle(double height,double width) {
	super();
	this.height=height;
	this.width=width;
}
public Rectangle(int x,int y,double height,double width) {
	super(x,y);
	this.height=height;
	this.width=width;
}
public void draw() {
	System.out.println("draw in rectangle");
	System.out.println("x="+super.getX()+"\ty="+super.getY()+"\theight="+this.height+"\twidth="+this.width);
}
}
