package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentExternalizableTest {
	 
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		StudentExternalizable s = new StudentExternalizable(20,"sagar");
			
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Externalizable.txt"));
		
		out.writeObject(s);
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\IO\\Externalizable.txt"));
		
      s = (StudentExternalizable) in.readObject();
		
      
      
      System.out.println(s.getId());
      System.out.println(s.getName());
      
      
      out.close();
      in.close();
	}
}
