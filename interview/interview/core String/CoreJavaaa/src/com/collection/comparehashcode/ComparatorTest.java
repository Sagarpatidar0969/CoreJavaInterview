package com.collection.comparehashcode;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest { 
public static void main(String[] args) {
		
		ComparatorEx c = new ComparatorEx(103, "iumit", "9987");
		ComparatorEx c1 = new ComparatorEx(109, "Ashu", "9955");
		ComparatorEx c2 = new ComparatorEx(107, "jatin", "9944");

		
		ArrayList al = new ArrayList();
		
		al.add(c);
		al.add(c1);
		al.add(c2);
		
		Collections.sort(al, new ComparatorOrderById());
		
		System.out.println(al);
		
		
		System.out.println("--------------------------------------------------------------------");

		ComparatorEx c3 = new ComparatorEx(103, "sumit", "9987");
		ComparatorEx c4 = new ComparatorEx(109, "Ashu", "9955");
		ComparatorEx c5 = new ComparatorEx(107, "jatin", "9944");

		
		ArrayList a2 = new ArrayList();
		
		a2.add(c3);
		a2.add(c4);
		a2.add(c5);
		
		Collections.sort(a2, new ComparatorOrderByName());
		
		System.out.println(a2);
		
		System.out.println("--------------------------------------------------------------------");

		ComparatorEx c6 = new ComparatorEx(103, "iumit", "5987");
		ComparatorEx c7 = new ComparatorEx(109, "Ashu", "1955");
		ComparatorEx c8 = new ComparatorEx(107, "jatin", "2944");

		
		ArrayList a3 = new ArrayList();
		
		a3.add(c6);
		a3.add(c7);
		a3.add(c8);
		
		Collections.sort(a3, new ComparatorOrderByPhoneNo());
		
		System.out.println(a3);
		
		
}
}
