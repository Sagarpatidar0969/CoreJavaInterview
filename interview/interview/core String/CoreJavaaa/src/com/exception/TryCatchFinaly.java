package com.exception;

public class TryCatchFinaly {
	public static void main(String[] args) {
		String s = null;
		//String s1 ="sagar"; //then try and finally chalega
		
		try {
			System.out.println(s.length());
		}catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println(e);
			//System.exit(0);
		}finally {
			System.out.println("this is finally block");
		}
		
	}

}
