package com.exception;

public class HierarchyExceptionExample {
	public static void main(String[] args) {
		String name = "Java";
		//int i =10;

		try {
			System.out.println(name.charAt(4));
			//int j =i/0;
			//System.out.println(j);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException........");

		} catch (Exception e) {
			System.out.println("Exception........");
			System.out.println(e);
		}
	}
}