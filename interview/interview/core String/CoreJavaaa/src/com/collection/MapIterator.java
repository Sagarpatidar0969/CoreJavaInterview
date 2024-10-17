package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {
		Map m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(40000, "fourh");
		m.put(9, null);
		m.put(4, "sr");
		m.put(4, "sagar");
          
		for(Object o :m.entrySet()) {
			//entrySet() returns a set of Map.Entry objects,
			Map.Entry  pair =  (Entry) o;
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());

		//	System.out.println(o);

		}
		// System.out.println(m);
		System.out.println("fffffffff");
		for (Object o : m.values()) {

			System.out.println(o);

			// System.out.println(m);
		}
		System.out.println("ssssssssssss");
		for (Object o : m.keySet()) {

			System.out.println(o);
		}

	}

}