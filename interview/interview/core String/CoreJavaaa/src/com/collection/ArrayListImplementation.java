package com.collection;

import java.util.ArrayList;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(l);
		System.out.println(l.indexOf(2));
		
		Integer i = new Integer(6);
		l.add(i);
		
		System.out.println(l);
		System.out.println(l.get(3));
		
		
	}

}
