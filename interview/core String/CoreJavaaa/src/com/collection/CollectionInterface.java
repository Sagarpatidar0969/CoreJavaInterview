package com.collection;

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
		// list interface and its classes
//		List l = new ArrayList();
//		List l1 =new LinkedList();
//		List l2 = new Vector();

		// set interface and its classes
//		Set l = new HashSet();
//		Set l1= new LinkedHashSet();

		// Queue interface and its classes

//		Queue q = new ArrayDeque();
//		Queue q1 = new PriorityQueue();

//These methods are common in all collection interfaces

		List l = new ArrayList();
		l.add("sagar");
		l.add("rahul");
		
		System.out.println(l);
//		l.clear();
//		System.out.println();

		List a = new ArrayList();
		a.add("sagar");
		a.add("raul");
		

		System.out.println(a);
		
		
//		if(l.equals(a)) {
//			if(l.hashCode()==a.hashCode()) {
//				System.out.println("true");
//				
//			}
//		}

//		System.out.println(l.containsAll(a));
		
		
		
		
		
//		System.out.println(a.contains("sagar"));
//		System.out.println(l.contains("Sourabh"));
//		System.out.println("containsAll all same"  + "   " +l.containsAll(a));

//		l.retainAll(a);// comman value return and hold in l(list) if does not get any comman value it clear all element
//						// calling mathods aur l obj aur likr l.retainA(c) inn l is empty
//		System.out.println("retainAll" + "  " + l);

//		System.out.println(l);
//
//		System.out.println(a);

//		l.addAll(a);
//		System.out.println(l);
////		
//		System.out.println(l.isEmpty());
//		
//		System.out.println(l.size());

		System.out.println(l.removeAll(a));
		System.out.println(l);
		System.out.println(a);

//		System.out.println(l.remove(Character.valueOf('a')));
//		
//		System.out.println(a.remove("sagaraaa"));
//		System.out.println(l);

//		System.out.println(l);
//		System.out.println(a);

	}

}
