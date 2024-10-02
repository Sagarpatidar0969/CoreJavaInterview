package com.opp.methodoverloading;

public class methodoverloading {
	
	public void num(int a,int b) {
		System.out.println(a+b);
	}
	public void num(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		
		m.num(1);
		m.num(1, 2);
	}

}
