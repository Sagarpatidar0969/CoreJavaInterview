package com.rays.javabasics;

public class MaximumNumber {
	
	public static void main(String[] args) {
		int n = 138;
		
		int max  = n%10;//8
		int rem = 0;
		
		while(n>0) {
			rem = n%10;
			
			if(rem>max) {
				max = rem;
			}
			
			n  = n/10;
		}
		System.out.println(max);
	}

}
