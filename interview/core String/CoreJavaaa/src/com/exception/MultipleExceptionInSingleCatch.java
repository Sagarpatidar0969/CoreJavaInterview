package com.exception;

public class MultipleExceptionInSingleCatch {
public static void main(String[] args) {
	//int i =10;
	String s =null;
	try {
		//int j =i/0;
		//System.out.println(j);
		System.out.println(s.length());
		
		
	}catch(ArithmeticException | NullPointerException e) {
		
		System.out.println(e);
	}
}
}
