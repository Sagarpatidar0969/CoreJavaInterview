package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateExcep {
	
	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Item 1");
	        list.add("Item 2");
	        list.add("Item 3");

	        Iterator<String> iterator = list.iterator();

	        try {
	            while (iterator.hasNext()) {
	           //     String item = iterator.next();
	                System.out.println( iterator.next());

	                // Attempt to call remove() before calling next() again
	                // which results in IllegalStateException
	                
	                iterator.remove();  // Valid after next() but invalid if called multiple times without next()
	               // System.out.println( iterator.next());
	                iterator.remove();  // This will cause IllegalStateException
	            }
	        } catch (IllegalStateException e) {
	            System.out.println("IllegalStateException caught!");
	            e.printStackTrace();
	        }
	    }
	}



