package com.exception;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
		String [] s = {"sagar","rahul","ram"};
		//int [] s = {12,3,342234,4353};	
		try {
			for (int i = 0; i < s.length; i++) {
				System.out.println(s[11]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
