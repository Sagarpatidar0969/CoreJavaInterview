package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailRW {
	public static void main(String[] args) throws IOException{
		
	BufferedReader in = new BufferedReader(new FileReader("D:\\IO\\gmail.txt"));
	
	PrintWriter out = new PrintWriter("D:\\IO\\orggmail.txt");
	
	String emailReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	
	String line = in.readLine();
	
	while(line != null) {
		if(line.matches(emailReg)) {
			out.println(line);
		}
		
		line = in.readLine();
	}
	
	out.close();
	in.close();
		
		
	}

}
