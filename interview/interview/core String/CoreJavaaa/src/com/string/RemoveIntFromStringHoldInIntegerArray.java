package com.string;

import java.util.Arrays;

public class RemoveIntFromStringHoldInIntegerArray {
	public static void main(String[] args) {
		String name = "rays1234";
		String result = "";

		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(ch[i])) {
				result = result + (ch[i]);

			}
		}
		System.out.println(result);
		char[] x = result.toCharArray();
		
		int arr[] = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			 arr[i]=Character.getNumericValue(x[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(x));

	}

}
