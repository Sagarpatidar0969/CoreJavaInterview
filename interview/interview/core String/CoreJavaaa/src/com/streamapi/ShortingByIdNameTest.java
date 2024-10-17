package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortingByIdNameTest {

	public static void main(String[] args) {
		List<ShortingByIdName> l = new ArrayList<ShortingByIdName>();

		l.add(new ShortingByIdName("Sourabh", 101));
		l.add(new ShortingByIdName("naman", 120));
		l.add(new ShortingByIdName("Ashu", 1044));
		l.add(new ShortingByIdName("Bhaskar", 1065));
		l.add(new ShortingByIdName("daksh", 105));

		// short by id
		System.out.println("Short by idd");
		l.stream().sorted(Comparator.comparingInt(ShortingByIdName::getId)).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));

		// short by name
		System.out.println("short by name");

		l.stream().sorted(Comparator.comparing(ShortingByIdName::getName)).collect(Collectors.toList())
				.forEach(s -> System.out.println(s));
	}

}
