package com.collection.hashcodeequals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashcodeEqualssStringTest {
public static void main(String[] args) {
		
		HashcodeEqualssString s1 = new HashcodeEqualssString(101, "Sourabh",5990);
		HashcodeEqualssString s2= new HashcodeEqualssString(102, "Sourabh",5990);
		HashcodeEqualssString s3 = new HashcodeEqualssString(101, "Sourabh",5990);
//		
//		if(s1.equals(s2)) {
//			if(s1.hashCode()==s2.hashCode()) {
//				System.out.println("equal");
//			}else {
//				System.out.println("not equal");
//			}
//		}
		
		List l = new ArrayList();
		
		l.add(s1);
		l.add(s2);
		l.remove(s3);
		
		System.out.println(l);
		
		
		
		
//		if(s1.hashCode()==s2.hashCode()) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
		
		
		
		
		
//		Map map = new HashMap();
//// it remove dublicate data
//		map.put(s1, "one");
//
//		map.put(s2, "two");
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
////		map.put(1, s1);
////		
////	    map.put(2, s2);
//		
//		
//
//		System.out.println(map);
}
}
