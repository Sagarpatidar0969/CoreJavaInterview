package com.rays.exception;

public class StringIndexOutOfBounds {
	public static void main(String[] args) {
	String s ="sagar";
	try {
		System.out.println(s.charAt(8));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	}

}
