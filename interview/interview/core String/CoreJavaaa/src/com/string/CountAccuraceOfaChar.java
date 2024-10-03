package com.string;

public class CountAccuraceOfaChar {
	
	public static void main(String[] args) {
		
		String name = "Sachin Jat";
		int count = 0;
		
		char ch[] = name.toCharArray();
		
		for (int i = 0; i < ch.length; i++)  {
			
			//char ch = name.charAt(i);
			
			 String m = String.valueOf(ch[i]);
			 
			 if (m.matches("a")) {
				 
				 count++;
				
			}
			
		}
		
		System.out.println("a : " + count );
	}

}
