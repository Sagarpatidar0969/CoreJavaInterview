package com.rays.exception;

public class TryWithFinally {
	public static void main(String[] args) {
		String s ="sagar";
		try {
			
			System.out.println(s.charAt(10));
			System.out.println("try");
			//System.exit(0);  it does not work on try block
		}finally {
			System.out.println("finally");
		}
	}

}
