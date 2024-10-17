package com.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadAndWriteFromKeyboard {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter file = new FileWriter("D:\\IO\\SagarExit.txt", true);
		System.out.println("enter here");

		String str = br.readLine();

		while (!str.equalsIgnoreCase("exit")) {
			file.write(str);
			file.write(System.lineSeparator());

			System.out.println(str);
			str = br.readLine();
		}
		br.close();
		file.close();
	}
}
