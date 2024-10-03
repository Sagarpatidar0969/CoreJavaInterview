package com.collection.comparehashcode;

import java.util.Comparator;

public class ComparatorOrderByName implements Comparator<ComparatorEx>{

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		// TODO Auto-generated method stub
		return o2.name.compareTo(o1.name);
	}
	
	

}
