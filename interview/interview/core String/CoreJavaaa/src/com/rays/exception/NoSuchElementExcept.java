package com.rays.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElementExcept {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList();
		list.add("sagar");
		list.add("dilip");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		try {
			System.out.println(it.next());
		}catch(NoSuchElementException e) {
			System.out.println(e);
		}
		
	}

}
