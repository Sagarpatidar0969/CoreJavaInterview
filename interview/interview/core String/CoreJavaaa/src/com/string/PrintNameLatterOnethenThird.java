package com.string;

public class PrintNameLatterOnethenThird {
	
	public static void main(String[] args) {
		String name = "sagarpatidar";
		
		char []ch=name.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(i%2==0) {
				System.out.println(ch[i]);
			}
			
		}
		
		
	}

}
