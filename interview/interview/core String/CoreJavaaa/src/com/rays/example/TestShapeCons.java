package com.rays.example;

public class TestShapeCons {
	public static void main(String[] args) {
		Shape[] s = new Shape[2];
		
		s[0] = new  Circle(5);
		s[1] = new Rectangle(2,2);
		
		Circle c =  (Circle)s[0];
		Rectangle r =(Rectangle) s[1];
		
		System.out.println(c.area());
		System.out.println(r.area());
		
		double a =area(s);
		
		System.out.println(a);
		
		
	}
	
	public static double area(Shape[] s) {
	double result =0;
		for (int i = 0; i < s.length; i++) {
			 result = result+s[i].area();
		}
		return result;
		
	}

}
