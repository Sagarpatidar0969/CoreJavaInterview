package com.rays.javabasics;

public class SecondLargestNo {
	
	public static void main(String[] args) {
		int n[] = {1,7,5,6,9};
		
		int count = 0;
		int temp =0;
		
		
		for (int i = 0; i < n.length; i++) {
		
			
			if(n[i]>temp) {
				count = temp;
				temp = n[i];
			}
			if(count<n[i] && n[i] != temp) {
				count = n[i];
			}
			
		}
		System.out.println(count);
		
	}

}
