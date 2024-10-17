package com.rays.practice;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		int[] n = {8,50,3,2};
		int temp =0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length-1; j++) {
				if(n[j]>n[j+1]) {
				temp =n[j];
				n[j]=n[j+1];
				n[j+1]=temp;
				
				}
			}
			
			
		}
		for (int k = 0; k < n.length; k++) {
			System.out.println(n[k]);
		}
		
	}
	
}
