package com.javabasics;

public class FunctionalInterfacesesLambdaMain{
	public static void main(String[] args) {
		FunctionInterfaceses f = (a,b ) -> {
			return a +b;
		};
		int a =10;
		int b = 20;
		
		FunctionInterfaceses.multi(a, b);
		f.sub(a, b);
		System.out.println(f.sum(a, b));
	}
}