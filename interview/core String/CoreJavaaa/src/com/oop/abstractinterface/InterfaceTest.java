package com.oop.abstractinterface;

public class InterfaceTest implements Interfacee {

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		
    int s	=	t.sum(x, 10);
    System.out.println(s);
	}

}
