package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializableTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		StudentSerializable s = new StudentSerializable(20, "sagar");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\student.txt"));
		
		out.writeObject(s);
		
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\student.txt"));
		
		s = (StudentSerializable) in.readObject();
		
		System.out.println(s);
	}

}
