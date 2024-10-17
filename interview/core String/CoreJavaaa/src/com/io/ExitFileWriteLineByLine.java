package com.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {
	public static void main(String[] args) throws IOException{
		
		FileWriter file = new FileWriter("D:\\IO\\SagarExit.txt", true);
		
		PrintWriter out = new PrintWriter(file);
		
		out.println("hii");
		out.println("sagar");
		//out.flush();
		out.close();
		file.close();
		
		System.out.println("data write successfully");
		
	}

}
