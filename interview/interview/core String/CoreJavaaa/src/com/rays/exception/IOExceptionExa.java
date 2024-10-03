package com.rays.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExa {
	public static void main(String[] args) {
		
	
	
		 File f = new File("E:\\MongoDB.txt");
	
	try {
		FileReader r = new FileReader(f);
		System.out.println("success");
	}catch(IOException e) {
		System.out.println("IOException" +"   "+e.getMessage());
		//System.out.println(e);
	}

}
}