package com.rays.javabasics;

public class MethodCallings {
	
	public static int indexFound(int[] n , int a){
		
		for (int i = 0; i < n.length; i++) {
			
			if(n[i]==a) {
				return i;
			}
			
		}
		
		
		
		return -1;	
	}
	
	
	
	
	
	
	
		public static void main(String[] args) {
			
			int[] n = {1,2,355,5,6,7};
			int a = 3;
			
			int indexfound = indexFound(n, a);
			
			System.out.println(indexfound);
			
			
		}

}

