package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("one", 1);
	    map.put("two", 2);
	    map.put("three", 3);
		
//		map.put(1, "one");
//	    map.put(2, "three");
//	    map.put(2, "three");
	    
	    System.out.println(map);
	    
	    for(Object o :map.entrySet()) {
	    	System.out.println(o);
	    }
	    
	    Set s = map.entrySet();
	    System.out.println(s);
	}

}
