 package com.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamSalary2000Test {

	public static void main(String[] args) {

		List<StreamSalary2000> l = new ArrayList();

		l.add(new StreamSalary2000("Sagar", 88888));

		l.add((new StreamSalary2000("sourabh", 967000)));
		l.add((new StreamSalary2000("sumit", 2000)));
		l.add((new StreamSalary2000("ashu", 363400)));
		l.add((new StreamSalary2000("naman", 4000)));
		l.add((new StreamSalary2000("annu", 56450)));
		l.add((new StreamSalary2000("sachin", 7000)));
		l.add((new StreamSalary2000("aminsh", 8000)));
		l.add((new StreamSalary2000("ssourya", 9000000)));

		// greater then 2000
		l.stream().filter(e -> e.salary > 2000).forEach(s -> System.out.println(s.salary));

		// sort and greater than 2000
		l.stream().sorted(Comparator.comparing(StreamSalary2000::getSalary)).filter(e -> e.salary > 2000)
				.forEach(s -> System.out.println(s));

		System.out.println("highest salary");
		l.stream().sorted(Comparator.comparing(StreamSalary2000::getSalary).reversed()).findFirst()
				.ifPresent(s -> System.out.println(s));

		System.out.println(" Second highest salary");
		l.stream().sorted(Comparator.comparing(StreamSalary2000::getSalary).reversed()).skip(1).findFirst()
				.ifPresent(s -> System.out.println(s));

		// second
		l.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.ifPresent(s -> System.out.println(s));

	}

}
