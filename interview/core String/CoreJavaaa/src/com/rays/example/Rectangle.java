package com.rays.example;

public class Rectangle extends Shape{
	public int length;
	public int width;
 
	public Rectangle(int length,int width) {
		this.length=length;
		this.width = width;
	}
	public double area() {
		return length*width;
	}
}

