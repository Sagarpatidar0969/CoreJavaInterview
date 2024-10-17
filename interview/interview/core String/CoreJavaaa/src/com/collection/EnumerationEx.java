package com.collection;

import java.util.Enumeration;
import java.util.Vector;

import com.javabasics.EnumarationHuman;

public class EnumerationEx {
	
	public static void main(String[] args) {
		Vector v = new Vector<>();
		
		v.add("sr");
		v.add("dilip");
		v.add("neeraj");
		
		Enumeration e = v.elements();
		v.add("gggg");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
