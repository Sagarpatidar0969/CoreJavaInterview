package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		 ArrayList l = new ArrayList<>();
		 
		 for (int i = 1; i <=1000; i++) {
			  l.add(i);
//			 Random r = new Random();
//			 
//			 l.add(r.nextInt(900)+100);
			 
		}
		 System.out.println(l);
		 HashSet<Integer> hashSet = new HashSet<>(l);
		 
		 Random r = new Random();
		 
		 ArrayList<Integer> l1 = new ArrayList<>();
		 for (int i = 0; i <=50; i++) {
			 
			  l1.add(r.nextInt(900)+100);
			// System.out.println(l.get(z));
			
		}
		 long s = System.nanoTime();
		 for(int num: l1) {
			 
			 l1.contains(555);
			 
			 
		 }
		 
		 long s1 = System.nanoTime();
		 
		 
		 long ll= s1-s;
		 System.out.println(ll);
	}
}
