package com.javabasics;

public class MinimumNumber {
	public static void main(String[] args) {
		int n = 123;
		
		int rem = 0;
		int min = n%10; //3
		
		while(n>0) {
			rem = n%10;
			
			if(rem<min) {
				min =rem;
			}
			n = n/10;
		}
		System.out.println(min);
	}

}
