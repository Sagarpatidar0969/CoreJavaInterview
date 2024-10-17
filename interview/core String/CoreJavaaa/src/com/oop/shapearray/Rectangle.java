package com.oop.shapearray;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double length,double width ) {
		this.length =length;
		this.width= width;
	}
	
	
	//by setter getter
	public void setLength(double lenght) {
		this.length = lenght;
		
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}

}
