package com.collection.comparehashcode;

import java.util.Comparator;

public class ComparatorOrderByPhoneNo implements Comparator<ComparatorEx> {

	@Override
	public int compare(ComparatorEx o1, ComparatorEx o2) {
		// TODO Auto-generated method stub
		return o1.phoneNo.compareTo(o2.phoneNo);
	}
	

}
