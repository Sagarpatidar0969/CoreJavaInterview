package com.javabasics;

public class SwitchCase {

	public static void main(String[] args) {

		String m = "mar";

		switch (m) {

		case "jan":
			System.out.println("1st month");
			break;

		case "feb":
			System.out.println("2nd month");
			break;

		case "mar":
			System.out.println("3rd month");
			break;

		default:
			System.out.println("this is default");
			break;
		}

	}

}