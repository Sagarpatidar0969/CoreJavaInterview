package com.javabasics;

public class GetterNumber {
	public static void main(String[] args) {
		int a = 1000;
		int b = 300;
		int c  =20000;
		
		if(a>b && a>c) {
			System.out.println(a);
		}else if (b>a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}

}
