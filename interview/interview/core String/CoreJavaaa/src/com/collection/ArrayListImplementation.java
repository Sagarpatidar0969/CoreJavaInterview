package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImplementation {
	public static void main(String[] args) {
		ArrayList l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.set(3, 55);
		
		Iterator i = l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(l);
		
		
//		System.out.println(l);
//		System.out.println(l.indexOf(2));
//		
//		Integer i = new Integer(6);
//		l.add(i);
//		
//		l.set(3, 9);
//		
//		l.remove(0);
//		System.out.println("yyyyyyyyyyy");
//		System.out.println(l);
//		
//		System.out.println("gettttttttttt");
//		System.out.println(l.get(0));
		
//		System.out.println(l.subList(1, 3));
//		
//		System.out.println(l);
//		
//		System.out.println(l.lastIndexOf(9));
//		
	}

}
