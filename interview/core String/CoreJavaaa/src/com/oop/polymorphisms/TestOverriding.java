package com.oop.polymorphisms;

public class TestOverriding {
	public static void main(String[] args) {
		
	
	
	ShapeOverriding s = new RectangleOverriding(2, 2);
	ShapeOverriding s1 = new CircleOverriding(2);
	
	System.out.println(s.area());
	System.out.println(s1.area());
	
	}
}
