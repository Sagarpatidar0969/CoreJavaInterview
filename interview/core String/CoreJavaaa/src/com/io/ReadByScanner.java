package com.io;

import java.io.FileReader;
import java.util.Scanner;

public class ReadByScanner {
	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("D:\\IO\\SagarExit.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		file.close();
		sc.close();
	}
}
