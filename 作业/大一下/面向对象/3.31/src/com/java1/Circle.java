package com.java1;

public class Circle extends Shape {
private double r;
public Circle() {
	super();
	this.r=1.0;
}
public Circle(double r) {
	super();
	this.r=r;
}
public Circle(int x,int y,double r) {
	super(x,y);
	this.r=r;
}
public double getR() {
	return r;
}
public void setR(double r) {
	this.r = r;
}
public void draw() {
	System.out.println("draw in circle");
	System.out.println("x="+super.getX()+"\ty="+super.getY()+"\tr="+this.r);
}
}
