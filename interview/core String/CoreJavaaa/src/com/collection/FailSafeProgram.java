package com.collection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class FailSafeProgram {
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> a = new ArrayBlockingQueue(10);
		
		a.add(10);
		a.add(20);
		a.add(30);
		
		Iterator it = a.iterator();
		
		a.add(40);
		a.add(50);
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
