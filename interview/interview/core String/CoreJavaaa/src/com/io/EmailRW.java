package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailRW {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("D:\\IO\\gmail.txt"));

//	PrintWriter out = new PrintWriter("D:\\IO\\orggmail.txt");

		FileWriter file = new FileWriter("D:\\IO\\orggmail.txt");

		String emailReg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+" + "(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String str = in.readLine();

		while (str != null) {
			if (str.matches(emailReg)) {
				file.write(str);
			}
				str = in.readLine();
			}

			file.close();
			in.close();
		
	}
}
