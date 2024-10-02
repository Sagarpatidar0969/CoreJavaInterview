package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsEx {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add(101);
		c.add("sagar");
		c.add("patidar");
		System.out.println(c);
		System.out.println(c.isEmpty());
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
