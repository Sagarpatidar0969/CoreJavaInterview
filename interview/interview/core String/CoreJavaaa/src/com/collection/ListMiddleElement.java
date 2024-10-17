package com.collection;

import java.util.LinkedList;
import java.util.List;

public class ListMiddleElement {
	public static void main(String[] args) {
		List l = new LinkedList();
		
		l.add("sourabh");
		l.add("sumit");
		l.add("naman");
		l.add("ashu"); 
		l.add("sagar");
		l.add("dilip");
	    l.add("annu");
	    l.add("yash");
	    l.add("sachin");
	    l.add("sachin");
	    
	  //  System.out.println(l);
	    
	    System.out.println(l.get((l.size()-1)/2));
}
}