package com.streamapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateElement {
	public static void main(String[] args) {
		
	
	
	List l = Arrays.asList(1,2,3,4,5,5,6,6,7,8);
	
	
	//l.stream().distinct().forEach(x->System.out.println(x));
	
	Set s = new  HashSet();
	
	l.stream().filter(i->!s.add(i)).forEach(x->System.out.println(x));
	
	//System.out.println(s);
	
	}
}
