package com.oop.polymorphismreturn;

public class Shape {
	
	public double area() {
		return 0;
	}
	
	public static Shape getShape(int i) {
		if(i == 1) {
			return  new Rectangle(2, 2);
		}
		if(i==2) {
			return new Circle(2);
		}
		return new Shape();
	}

}
