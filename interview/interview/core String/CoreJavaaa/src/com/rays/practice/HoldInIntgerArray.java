package com.rays.practice;

import java.util.Arrays;

public class HoldInIntgerArray {
	
	
	public static void main(String[] args) {
		
		String name = "sachin123jat";
		String result = "";
		
		char [] ch = name.toCharArray();
		
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(ch[i])) {
				result = result + ch[i];
				System.out.print("");
				
			}
			
		}
		int [] intArray = new int [result.length()];
		for (int i = 0; i < result.length(); i++) {
			intArray [i] = Character.getNumericValue(result.charAt(i));
			
		}
		
		System.out.println(Arrays.toString(intArray));
	
	}
}
