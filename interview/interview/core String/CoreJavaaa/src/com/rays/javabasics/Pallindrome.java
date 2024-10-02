package com.rays.javabasics;

public class Pallindrome {
	public static void main(String[] args) {
		int n =121;
		int p = n;
		int rem=0;
		 int sum = 0;
		
		while(n>0) {
			
			rem=n%10;
			
			sum = rem +(sum*10);
			
			n = n/10;
			
			
		}
		if(p==sum) {
			System.out.println("yes");
		System.out.println(sum);
		}else {
			System.out.println("not");
		}
	}

}
