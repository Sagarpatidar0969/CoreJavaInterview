 package com.oop.polymorphismreturn;

public class Circle extends Shape{
	
	private double radius;
	public final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return radius*radius*PI;
	}

}
