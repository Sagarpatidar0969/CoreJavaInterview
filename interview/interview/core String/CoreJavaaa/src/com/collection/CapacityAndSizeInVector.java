package com.collection;

import java.util.Vector;

public class CapacityAndSizeInVector {
 public static void main(String[] args) {
	Vector v = new Vector();
	v.add(1);
	v.add(2);
	v.add("sr");
	v.add(3);
	
	v.remove(0);
	System.out.println(v);
	System.out.println(v.capacity());
	System.out.println(v.size());
}
}
