package com.collection.hashcodeequals;

import java.util.HashMap;
import java.util.Map;

public class HashcodeEqualssStringTest {
public static void main(String[] args) {
		
		HashcodeEqualssString s1 = new HashcodeEqualssString(101, "Sourabh",5990);
		HashcodeEqualssString s2= new HashcodeEqualssString(101, "Sourabh",5990);
		
//		if(s1.equals(s2)) {
//			if(s1.hashCode()==s2.hashCode()) {
//				System.out.println("equal");
//			}else {
//				System.out.println("not equal");
//			}
//		}
		
		
		
		Map map = new HashMap();
// it remove dublicate data
		map.put(s1, "one");

		map.put(s2, "two");
		
//		map.put(1, s1);
//		
//	    map.put(2, s2);
		
		

		System.out.println(map);
}
}
