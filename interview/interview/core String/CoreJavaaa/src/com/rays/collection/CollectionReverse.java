package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionReverse {
public static void main(String[] args) {
	ArrayList l = new ArrayList<>();
	l.add(1);
	l.add(2);
	l.add(3);
	l.add(4);
	l.add(5);
	l.add(6);
	System.out.println(l);
	
	Collections.reverse(l);
	System.out.println(l);
}
}
