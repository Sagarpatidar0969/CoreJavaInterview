package com.rays.practice;

//WAP to reverse string on the same place

public class OnPlaceReverseString {

	public static void main(String[] args) {

		String name = "Sachin Jat";
		String[] a = name.split(" ");
		for (int i = 0; i < a.length; i++) {
			for (int j = a[i].length() - 1; j >= 0; j--) {

				System.out.print(a[i].charAt(j));
			}
		System.out.print(" ");

	}
	}

}


