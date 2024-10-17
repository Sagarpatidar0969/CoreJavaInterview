package com.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
    public static void main(String[] args) throws IOException {

        // Writing primitive data to a file
        DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\IO\\Primitive"));

        out.writeInt(10);           // Write an int (4 bytes)
        out.writeBoolean(true);     // Write a boolean (1 byte)
        out.writeDouble(45.25);     // Write a double (8 bytes)
        out.writeChar('A');         // Write a char (2 bytes)
        out.writeFloat(2.2F);       // Write a float (4 bytes)

        out.close();

        System.out.println("Data added");

        // Reading primitive data from a file
        DataInputStream in = new DataInputStream(new FileInputStream("D:\\IO\\Primitive"));

        System.out.println(in.readInt());        // Read int (4 bytes)
        System.out.println(in.readBoolean());    // Read boolean (1 byte)
        System.out.println(in.readDouble());     // Read double (8 bytes)
        System.out.println(in.readChar());       // Read char (2 bytes)
        System.out.println(in.readFloat());      // Read float (4 bytes)

        in.close();
    }
}
