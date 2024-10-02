package com.rays.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class CollectionInterface {
	
	public static void main(String[] args) {
		//list interface and its classes
//		List l = new ArrayList();
//		List l1 =new LinkedList();
//		List l2 = new Vector();
		
		//set interface and its classes
//		Set l = new HashSet();
//		Set l1= new LinkedHashSet();
		
		//Queue interface and its classes
		
//		Queue q = new ArrayDeque();
//		Queue q1 = new PriorityQueue();
		
//These methods are common in all collection interfaces

		
		List l= new ArrayList();
		l.add(12);
		l.add('b');
		l.add('a');
		l.add("Sourabh");
		System.out.println(l);
		
		List a = new ArrayList();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		
		System.out.println(a);
		
		System.out.println(a.contains("sagar"));
		System.out.println(l.contains("Sourabh"));
		System.out.println(l.containsAll(a));
		
//		l.retainAll(a);
//		System.out.println(l);
		
		l.addAll(a);
		System.out.println(l);
		
		System.out.println(l.isEmpty());
		
		
		
		
		
		
	}
	

}
