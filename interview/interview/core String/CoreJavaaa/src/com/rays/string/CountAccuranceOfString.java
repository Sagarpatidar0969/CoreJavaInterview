package com.rays.string;

public class CountAccuranceOfString {

	public static void main(String[] args) {

		String name = "Vikash yadav";
		char[] ch = name.toCharArray();
		

		for (char c : ch) {
			int count = 0;
			for (int i = 0; i < name.length(); i++) {

				if (c == name.charAt(i)) {
						
					count++;
																	
				}

			} 

		 	if (count >0) {

				System.out.println(c + " " + count);

				

			}

		}

	}

}
