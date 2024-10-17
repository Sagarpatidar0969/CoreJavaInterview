package com.collection.hashcodeequals;

import java.util.*;

public class HashcodeEqualssStringTest1 {
	public static void main(String[] args) {
		HashcodeEqualssString e = new HashcodeEqualssString(100, "sagar", 500);
		HashcodeEqualssString e1 = new HashcodeEqualssString(100, "sagar", 500);
		HashcodeEqualssString e2 = new HashcodeEqualssString(2, "sagar", 100);

		List l = new ArrayList();
		l.add(e);
		l.add(e2);
		System.out.println("oooooooooooooo");
		System.out.println(l);
		
		System.out.println("pppppppppp");
		l.remove(e1);
		System.out.println(l);

		System.out.println("setttttttttt");
		Set s = new HashSet();
		s.add(e);
		System.out.println(s);

		s.add(e1);
		System.out.println(s);

		s.add(e2);
		System.out.println("oooooooooooo");
		System.out.println(s);

		System.out.println("mapppppppp");
		Map m = new HashMap();

//		m.put(1, e);
//		m.put(2, e1);
//		m.put(3, e2);
//		System.out.println(m + "hhhh");
		
		m.put(e, 1);
		m.put(e1, 2);
		m.put(e2, 3);
		System.out.println(m);

//		m.remove(1, e);
//		System.out.println(m);
	}
}