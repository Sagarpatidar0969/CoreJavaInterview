package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamPrimeNumber {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11);

		l.stream().filter(x -> {
			if (x == 1) {
				return false;
			}
			int count = 0;
			for (int i = 2; i <= x - 1; i++) {
				if (x % i == 0) {
					count++;
				}

			}
			if (count == 0) {
				return true;
			}
			return false;
		}).forEach(e -> System.out.println(e));

		System.out.println("second method--------------------------------------------");
		l.stream().filter(x -> isPrime(x)).forEach(s -> System.out.println(s));

	}

	public static boolean isPrime(int x) {
		int count = 0;
		if (x == 1) {
			return false;
		}
		for (int i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		}
//		return count == 0;
		return false;
	}
}