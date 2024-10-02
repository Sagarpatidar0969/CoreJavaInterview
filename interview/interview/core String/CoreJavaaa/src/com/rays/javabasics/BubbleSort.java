package com.rays.javabasics;

public class BubbleSort {
	
	    public static void main(String[] args) {
	        int[] a = {8, 50, 0, 3, 2};

	        int temp = 0;

	        
//	        for (int i = 0; i < a.length; i++) {
//	            for (int j = i+1; j < a.length ; j++) {
//	                if (a[i]>a[j]) {
//	                    // Swap a[j] and a[j + 1]
//	                    temp = a[i];
//	                    a[i] = a[j];
//	                    a[j] = temp;
//	                }
//	            }
//	            System.out.println(a[i]);
//	            
//	        }
//	        
//	        System.out.println(a[a.length-1]);
  
         for (int i = 0; i < a.length-1; i++) {
        	 for (int j = 0; j < a.length-1; j++) {  
				if(a[j] > a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
         }
for (int j = 0; j < a.length; j++) {
	System.out.println(a[j]);
	
		
//		
//    }
//System.out.println(a[a.length-3]);
//	    }
}
	    }}

