package com.io;

import java.io.File;

public class FileDirectory {
	public static void main(String[] args) {
		
		File directory = new File("D:\\IO\\");
		
		String[] files=directory.list();
		
		for(String f:files) {
			System.out.println(f);
		}
	}

}
