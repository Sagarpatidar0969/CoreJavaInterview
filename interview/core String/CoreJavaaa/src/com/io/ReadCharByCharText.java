package com.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByCharText {
	public static void main(String[] args) throws IOException {
		
		FileReader file = new FileReader("D:\\IO\\sagar.txt");
		
		int i = file.read();
		
		while(i != -1) {
			//this print its asci value
			//System.out.println(i);
			
			System.out.println((char)i);
			
			i = file.read();
		}
		file.close();
		
		
	}

}
