package com.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(22,11,44,222,55,66,77,33,77);
		
		l.stream().max(Integer::compare).ifPresent(s->System.out.println(s));
		
		Integer in = l.stream().min(Integer::compare).get();
		
		System.out.println(in);
		
		//assecding order
		l.stream().sorted().findFirst().ifPresent(s->System.out.println(s));
		
		
		//desending order // reverse of sorted arr
		l.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(s->System.out.println(s));
	}

}
