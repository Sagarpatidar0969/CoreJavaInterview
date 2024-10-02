package com.rays.practice;

public class CountAccuranceOfString {

	public static void main(String[] args) {

		String name = "sachin jat";

		char[] ch = name.toCharArray();

		int count = 0;

		for (char c : ch) {
			for (int i = 0; i < name.length(); i++) {
				if (c == name.charAt(i)) {
					count++;

				}

			}
			if (count != 0) {
				System.out.println(c + " " + count);
				count = 0;

			}
		}
	}

}
