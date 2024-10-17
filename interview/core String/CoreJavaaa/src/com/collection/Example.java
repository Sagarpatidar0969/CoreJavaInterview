package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put(1,"one" );
		map.put(2,"two" );
		map.put(3,"three" );
		map.put(4,"four");
		map.put(3,"three");
		System.out.println(map);
		
		System.out.println(map.containsKey(1));
		System.out.println(map.containsValue("two"));
		System.out.println(map.remove(4));
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map.values());
		
		System.out.println(map);
		
		for(Object o :map.entrySet()) {
			//entrySet() returns a set of Map.Entry objects 
			Map.Entry  pair = (Entry) o;
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());}
	}

}
