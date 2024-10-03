 package com.javabasics;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
	
	int n = 153;
			int sum=0;
			int rem=0;
			int p = n;
	
	while(n>0) {
		rem=n%10;
		
		sum = sum+(rem*rem*rem);
		
		n=n/10;
		
	}
	if(sum==p) {
		System.out.println(sum + "yes");
}else {
	System.out.println("no");
}
	}
}
