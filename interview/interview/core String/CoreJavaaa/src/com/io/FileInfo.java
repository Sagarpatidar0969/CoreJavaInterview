package com.io;

import java.io.File;
import java.util.Date;

public class FileInfo {
 public static void main(String[] args) {
	 
	//for dictory and file name must obj name like f
		// File f = new File("D:\\IO\\");
	
	 File f = new File("D:\\IO\\fileInfotxt.txt");
	 
	 if(f.exists()) {
		 System.out.println(f.getName());
		 
		 System.out.println(f.getAbsolutePath());
		 
		 System.out.println("Access Permission");
		 System.out.println(f.canWrite());
		 System.out.println(f.canRead());
		 
		 System.out.println(f.isFile());
		 System.out.println(f.isDirectory());
		 
		 Date d = new  Date(f.lastModified());
				 System.out.println(d);
		 
		 long length = f.length();
		 
		 System.out.println(length);
	 }else {
		 System.out.println("file does not exit");
	 }
	 
}
}
