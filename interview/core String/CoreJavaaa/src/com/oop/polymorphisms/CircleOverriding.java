package com.oop.polymorphisms;

public class CircleOverriding extends ShapeOverriding{
	
	private double radius;
	private final double PI =3.14;
	
	public CircleOverriding(double radius) {
		this.radius =radius;
	}
	
	public double area() {
		return PI*radius*radius;
	}
	

}
