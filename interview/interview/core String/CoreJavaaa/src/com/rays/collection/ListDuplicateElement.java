package com.rays.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListDuplicateElement {
	public static void main(String[] args) {
		ArrayList<Object>l = new ArrayList();
		l.add("sourabh");
		l.add("sumit");
		l.add("naman");
		l.add("ashu");
		l.add("sourabh");
		l.add("sumit");
		l.add(1);
		l.add(1);
		l.add(2);
		System.out.println(l);
		
		Set<Object> s = new HashSet();
		
		for(Object str : l) {
			if(s.add(str)==false) {
				System.out.println(str);
			}
		}
	}

}
