package com.exception;

public class NumberFormatExce {
	public static void main(String[] args) {
		String s ="sagar123";
		
		try {
			int i=Integer.parseInt(s);
			System.out.println(i);
		}catch(NumberFormatException e ) {
			System.out.println(e);
		}
	}

}
