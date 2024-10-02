package com.rays.javabasics;

public class CountIndex {
	public static void main(String[] args) {
		int n[] = {1,3,5,7};
		int f = 5;
		int count =0;
		int p =0;
		
		for (int i = 0; i < n.length; i++) {
			
			if(n[i]==f) {
				p=i;
			}
			
			
		}
		System.out.println(p);
		
	}

}
