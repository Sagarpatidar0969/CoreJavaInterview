package com.rays.practice;

import java.util.Arrays;

public class MultiArrayReverse {
	
	static void reverse(String n) {
		 char ch[]=n.toCharArray();
		 for (int i = 0; i < ch.length/2; i++) {
			 char temp = ch[i];
			 ch[i]= ch[ch.length-i-1];
			 ch[ch.length-i-1] = temp;
		}
		 n = Arrays.toString(ch);
		 System.out.println(n);
	}
	
	
	
	public static void main(String[] args) {
		String  n[] = {"rahul","kirar","sr"};
		
		for (int i = 0; i < n.length; i++) {
			reverse(n[i]);
		}
		
		
		
		
 	}

}
