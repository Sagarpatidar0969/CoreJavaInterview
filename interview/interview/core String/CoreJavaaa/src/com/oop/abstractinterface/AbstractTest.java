package com.oop.abstractinterface;

public class AbstractTest extends AbstractExample {
	@Override
	public int sum(int a , int b) {
		return a+b;
	}
	public static void main(String[] args) {
		AbstractTest t = new AbstractTest();
		
		
		System.out.println(t.sum(x, 10));
			
	}
	
	
	
}
