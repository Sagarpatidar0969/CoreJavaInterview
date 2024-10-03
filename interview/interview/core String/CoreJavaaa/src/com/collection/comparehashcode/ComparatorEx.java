package com.collection.comparehashcode;

import java.util.Comparator;

public class ComparatorEx {

	int id;
	String name;
	String phoneNo;

	public ComparatorEx(int id, String name, String phoneNo) {

		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;

	}
	

	

	@Override
	public String toString() {

		return id + "," + name + "," + phoneNo;
	}



}
