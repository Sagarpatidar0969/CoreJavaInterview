package com.collection.comparehashcode;

import java.util.Comparator;

public class ComparatorOrderById implements Comparator<ComparatorEx>{
	
	public int compare(ComparatorEx o1,ComparatorEx o2) {
		return o1.id-o2.id;
	}
	

}
