package com.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysToStream {
	
	public static void main(String[] args) {
		
		String[] a1 = {"ram","shyam","sagar"};
		
		Stream<String> s1 = Arrays.stream(a1);
		s1.forEach(s -> System.out.println(s));
		
	}

}
