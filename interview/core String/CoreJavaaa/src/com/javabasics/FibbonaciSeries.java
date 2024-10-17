package com.javabasics;

public class FibbonaciSeries {
	public static void main(String[] args) {
		
	
		int temp = 0;
		int curr = 1;
		int prev = 0;
		
		
			
			while(temp<10) {
				temp = prev+curr;
				prev = curr;
				curr=temp;
				System.out.println(temp);
			}
			
		
		
	}

}
