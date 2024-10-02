package com.rays.javabasics;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int n[] = {2,4,6,3,7,1,9};
		int temp;
		
		for (int i = 0; i < n.length; i++) {
			
			for (int j = i+1; j < n.length; j++) {
				if(n[i] > n[j]) {
					
					temp = n[i];
					n[i]=n[j];
					n[j]=temp;
					
					
					
				}
			}
			System.out.println(n[i]);
		}
		System.out.println("with sorting");
		System.out.println("ddddddddddd");
		System.out.println( n[n.length-2]);
		System.out.println(n[n.length-1]);
 		
	

	
	int n1[] = {2,4,6,3,7,1,9};
	int temp1 =0;
	
	for (int i = 0; i < n1.length; i++) {
		
		if(n1[i] > temp1) {
			
			temp1 = n[i];
				
		
	}
	}
	System.out.println("without sorting");
	System.out.println("ddddddddddd");
	System.out.println(temp1);
		
}

}
