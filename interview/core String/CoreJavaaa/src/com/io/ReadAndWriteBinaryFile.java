package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {
	
	public static void main(String[] args) throws IOException {
		
		String source = "D:\\IO\\Hanumanji\\R.jpeg";
		String target = "D:\\IO\\Ramji\\Ramjii.jpg";
		
		
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);
	
		
		int i = in.read();
		while (i  != -1) {

			out.write(i);

		}
		System.out.println("success");
		
		
		
	}

	
}
