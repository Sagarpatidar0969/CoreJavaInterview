package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergeFile {
	
	public static void main(String[] args) throws IOException{
		FileWriter file = new FileWriter("D:\\IO\\Neeraj.txt",true);
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\IO\\SagarExit.txt"));	
				
		String s1 = br.readLine();
		
		while(s1 != null) {
			
			file.write(s1);
			
		s1 = br.readLine();
			
		}
		
		br.close();
		
		br = new BufferedReader(new FileReader("D:\\IO\\Dilip.txt"));
		
		String s2 = br.readLine();
		
		while(s2 != null) {
			
			file.write(s2);
			
			s2 = br.readLine();
		}
		br.close();
		file.close();
		
		System.out.println("succuess..........");
	
	}
	

}
