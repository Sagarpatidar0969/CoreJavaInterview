package com.oop.polymorphismreturn;

public class ShapeTest {
	
	public static void main(String[] args) {
//		Shape s = new Shape();
//		Shape s1=s.getShape(1);
		Shape s1 = Shape.getShape(1);
		System.out.println(s1.area());
		
		
		Shape s2 = Shape.getShape(2);
		System.out.println(s2.area());
		
		
		System.out.println(s1.area()+ s2.area());
	}

}
