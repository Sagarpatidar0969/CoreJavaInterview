package com.rays.example;


class Shapee{
	public double area() {
		return 0;
	}
	
	class Circle extends Shapee{
		public int radius;
		public final double PI =3.14;
		public Circle() {
			// TODO Auto-generated constructor stub
		}
		
		public Circle(int radius) {
			this.radius = radius;
		}
		public double area() {
			return PI*radius*radius;
			
			
		}
		
	}
	
	class Rectangle extends Shapee{
		public int length;
		public int width;
      public Rectangle() {
	// TODO Auto-generated constructor stub
}
		public Rectangle(int length,int width) {
			this.length=length;
			this.width = width;
		}
		public double area() {
			return length*width;
		}
	}
	
}


public class ShapeArray {
	
	public static void main(String[] args) {
		Shape[] s =new Shape[2];
		
		
	}
	
}
