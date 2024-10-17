package com.collection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		for(char a ='a';a<='z';a++) {
			s.push(a);
		}
		System.out.println(s);
//		
//		s.push("sagar");
//		s.push(00);
//		s.push("rahul");
//		s.push("ankit");
//		
//		System.out.println(s);
		//System.out.println(s.pop());
		
		Stack s1 = new Stack();
		
		while(!s.isEmpty()) {
			s1.push(s.pop());
		}
		System.out.println(s1);
		

		//Stack s2 = new Stack<>();
		while (!s1.isEmpty()) {

			s.push(s1.pop());
		}
		System.out.println(s);
	}
}