package com.rays.javabasics;

public class OddSum {
	
	public static void main(String[] args) {
		int n =123456;
		int sum =0;
		int rem = 0;
		int count = 0;
		
		
		while(n>0) {
			rem = n%10;
			
			if(rem%2 != 0) {
				sum =sum +rem;
				count++;
			}	
			n = n/10;
		}
		
		System.out.println(sum);

	}


}
