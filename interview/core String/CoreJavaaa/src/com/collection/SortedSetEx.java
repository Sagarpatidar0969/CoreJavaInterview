package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();

		s.add("app");
		s.add("ball");

		s.add("dog");
		s.add("cat");
		
		System.out.println(s);

		System.out.println(s.first());

		System.out.println(s.last());
		
		System.out.println("headset  "+s.headSet("cat"));
		
		System.out.println("Tailset   "+ s.tailSet("cat"));
		
		System.out.println("subset    "+ s.subSet("app", "cat"));
		
		

	}
}