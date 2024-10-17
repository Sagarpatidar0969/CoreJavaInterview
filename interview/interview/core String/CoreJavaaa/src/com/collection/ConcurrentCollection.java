package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class ConcurrentCollection {
	
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		Iterator it = a.iterator();
		
		a.add(5);//once iterator starts new element can not be inserted this will resolve concurrent collection
		while(it.hasNext()) {
			Object o = (Object)it.next();
			System.out.println(o);
		}
		
	  ArrayBlockingQueue<Integer> a1 = new ArrayBlockingQueue<Integer>(10);
	  
	  //ArrayBlockingQueue is the class of Concurrent Collection
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		Iterator<Integer> it1 = a1.iterator();
		a1.add(5);//after applying concurrent Collection element can be insrted after iteration 
		while(it1.hasNext()) {
			int i = it1.next();
			System.out.println(i);
		}
	}


}
