package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLineText {
	public static void main(String[] args) throws IOException{
		
		FileReader file = new FileReader("D:\\IO\\SagarExit.txt");
		
		BufferedReader br = new BufferedReader(file);
		
		 String str= br.readLine();
		 	
		// while(!str.equalsIgnoreCase("exit")) {
		 while(str != null) {
			 System.out.println(str);
			 str = br.readLine();
		 }
		 br.close();
		 file.close();
		
	}

}
