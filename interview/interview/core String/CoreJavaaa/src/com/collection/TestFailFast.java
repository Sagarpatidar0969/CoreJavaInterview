
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFailFast {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');

		Iterator it = list.iterator();

		//exception ConcurrentModificationException
		list.add('e');

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
