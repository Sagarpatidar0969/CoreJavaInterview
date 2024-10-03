package com.javabasics;

public class AverageSumOddEven {
	
	public static void main(String[] args) {
		int n =10;
		int e =0;
		int o=0;
		int esum = 0;
		int osum = 0;
		
		
		for (int i = 1; i <=n; i++) {
			if(i%2==0) {
				esum = esum+i;
				e++;
				
			}else {
				osum = osum+i;
				o++;
				
			}
			
		}System.out.println("even" + esum);
		System.out.println("odd" + osum);
		
		System.out.println("even" + esum/e);
		System.out.println("odd" + osum/o);
		
		
	}

}
