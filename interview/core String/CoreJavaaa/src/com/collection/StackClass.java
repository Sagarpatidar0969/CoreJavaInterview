package com.collection;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
	//Creating object of Stack class
		Stack s = new Stack();
		
		s.push(10);
		s.push(2);
		s.push(330);
		s.push(4);
		s.push(null);
		s.push(5); //Push method add element into stack
		System.out.println(s);
		
		System.out.println();
		System.out.println("peeeeeeeeeek   "+s.peek());

		System.out.println("peeeeeeeeeek   "+s.peek());
		System.out.println(s);
		
		
		System.out.println();
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());//s.pop() method used to access the element 
		System.out.println(s.pop());//last in first out
		System.out.println(s.pop());//empty stack exception
		
		
		
}
}