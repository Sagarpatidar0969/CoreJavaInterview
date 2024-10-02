package com.rays.javabasics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class currect {
	public static void main(String[] args)throws IOException {
		
		FileReader fw = new FileReader("C:\\Users\\Admin\\Downloads\\Email.txt");
		
		BufferedReader br = new BufferedReader(fw);
		
		String s1 = br.readLine();
		
		while(s1 !=null) {
			if(s1.endsWith("@gmail.com")) {
		
			}
			
		}
		
	}

}
