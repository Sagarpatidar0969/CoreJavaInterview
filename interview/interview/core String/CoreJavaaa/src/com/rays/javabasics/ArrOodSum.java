package com.rays.javabasics;

public class ArrOodSum {
	public static void main(String[] args) {
		int[] n = {11,12,13,14,15,16,17};
		
		int temp = 0;
		
		for (int i = 0; i < n.length; i++) {
			if(n[i]%2 != 0) {
				
				temp =temp + n[i];
				
			}
			
		}
		System.out.println(temp);
	}

}
