package com.oop.shapearray;

public class Circle extends Shape {
	
	private double radius;
	public final double PI=3.14;
	
  public Circle() {
	// TODO Auto-generated constructor stub
   }
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public void setRadius(double radius) {
		this.radius =radius;
	}
	public double getRadius() {
		return radius;
	}
	public double area() {
		return PI * radius*radius;
	}

}
