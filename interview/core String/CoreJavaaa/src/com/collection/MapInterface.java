package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	public static void main(String[] args) {

		Map m = new HashMap();

		m.put("ice", 1);
		m.put("dog", 2);
		m.put("cat", 3);
		m.put("ball", 4);
		//m.put("apple", 5); 
		m.put("apple", 5); // it will element in map
		
	//	m.put(1,"sr");
		m.put(null, null);
		System.out.println(m);
		
		System.out.println(m.get("cat"));
		
		System.out.println(m.containsKey("doge"));
		System.out.println(m.containsValue(33));
		
		System.out.println(m.entrySet());
		
		System.out.println(m.isEmpty());
		
		System.out.println(m.keySet());
		
		System.out.println(m.values());
		
		System.out.println("reeeeeeeeeeeeee");
		System.out.println(m.remove("cat"));
		
		//return true false
		//System.out.println(m.remove("cat", 4));
		System.out.println(m);
		
		System.out.println(m.size());
		
		TreeMap m1 = new TreeMap<>();

		m1.put("egg", 1);
		m1.put("dog", 2);
		m1.put("cat", 3);
		m1.put("ball", 4);
		m1.put("apple", 5);

		
		
		System.out.println(m1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}