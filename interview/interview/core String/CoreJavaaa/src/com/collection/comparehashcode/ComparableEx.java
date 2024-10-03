package com.collection.comparehashcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableEx implements Comparable<ComparableEx> {

	int id;
	String name;
	String phoneNo;
	
	public ComparableEx(int id, String name ,String phoneNo){
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		
	}
	
	public String toString() {
		return id+name+phoneNo;
	}
//	public int compareTo(ComparableEx o) {
//		return this.name.compareTo(o.name);
//	}
	//desending order
//	public int compareTo(ComparableEx o) {
//		return o.id-this.id;
//	}
	public int compareTo(ComparableEx o) {
		
		if(this.name == o.name) {
			return this.phoneNo.compareTo(o.phoneNo);
		}
		return this.id = o.id;
		
	}
	
	
	
	public static void main(String[] args) {
		ComparableEx c = new ComparableEx(105, "sourabh", "11126");
		ComparableEx c1 = new ComparableEx(102, "sourabh", "9927");
		ComparableEx c2 = new ComparableEx(103, "Ashu", "9928");
	ArrayList a1 = new ArrayList();
	a1.add(c);
	a1.add(c1);
	a1.add(c2);
	
	Collections.sort(a1);
	
	System.out.println(a1);
	
	}

	
}
