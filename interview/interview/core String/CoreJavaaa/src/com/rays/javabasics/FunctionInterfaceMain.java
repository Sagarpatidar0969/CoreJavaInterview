package com.rays.javabasics;

public class FunctionInterfaceMain {
	
	public static void main(String[] args) {
		FunctionInterfaceses f = new FunctionInterfaceses() {
			
			
			public int sum(int a, int b) {
				return a + b;
			}
		};
		
		int a = 10;
		int b = 20;
		
		FunctionInterfaceses.multi(a, b);
		
		f.sub(a, b);
		
		System.out.println(f.sum(a, b));
		
	
		
			
	}

}
