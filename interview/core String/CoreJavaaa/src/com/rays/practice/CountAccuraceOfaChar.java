package com.rays.practice;

public class CountAccuraceOfaChar {

	
	public static void main(String[] args) {
		
	String name = "sachin jat";
	int count = 0;
	
	for(int i =0;i<name.length();i++) {
		
		 char ch = name.charAt(i);
		 
		 String s  = String.valueOf(ch);
		 
		 if(s.matches("a")) {
			 count++;
		 }
	}System.out.println("a :" + count);
		
	}
	
	
}
