package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String[] args) {

		// classes of List interface
		List l = new ArrayList();
		// List l1 = new LinkedList();
		// List l2 = new Vector();

		// methods of ArrayList class
		l.add(12);
		l.add(2.36);
		l.add('N');
		l.add("Rajput");
		l.add(25);
		l.add("AMIT");
		System.out.println(l.remove(0));
		
		System.out.println(l);
		System.out.println(l.subList(1,2));
		
		System.out.println("getttttttttt");
		System.out.println(l.get(2));
		
		l.set(2,"sagar");
		System.out.println(l);
		
		System.out.println(l.indexOf("sagar"));
		
		System.out.println(l.lastIndexOf("sagarr"));
		
		l.add(null);
		System.out.println(l);
		
		l.add(null);
		System.out.println(l);
	}
}
