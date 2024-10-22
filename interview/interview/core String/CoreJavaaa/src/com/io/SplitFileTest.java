package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileTest {

	public static void main(String[] args) throws IOException {

		// 1. To count no of lines of the file
		String s = "D:\\IO\\split.txt";       // This is the path to the input file (the file that you want to split)
		int count = 0;                       // Variable to count the total number of lines in the file
		int nol = 2;                        // Number of lines each split file should contain
		File file = new File(s);           // Create a File object pointing to the file path

		                                 // Using a Scanner to read the file and count the number of lines
		Scanner sc = new Scanner(file);

		                          // Loop to count each line in the file
		while (sc.hasNext()) {
			sc.nextLine();      // Read each line
			count++;           // Increment the line count
		}

		System.out.println("No of lines: " + count);             // Output the total number of lines in the file

		// 2. To determine the number of output files
		int temp = count / nol;                               // Calculate how many full files can be created with 'nol' lines
		int rem = count % nol;                               // Remainder lines (if the total number of lines is not perfectly divisible by nol)
		int nof = temp;                                     // Initialize the number of files as 'temp'

		if (rem != 0) {                                   // If there are remaining lines (remainder is not zero)
			nof++;                                       // Create one more file to accommodate the leftover lines
		}
		System.out.println("No of files: " + nof);     // Output the number of split files to be created

		// 3. Read the data from the input file
		BufferedReader br = new BufferedReader(new FileReader(s));  // BufferedReader is used for reading the file line by line

		String str;                                    // Variable to hold each line of the file

		                                             // 4. Create and write to the output files
		for (int i = 1; i <= nof; i++) {            // Loop through to create the required number of output files

			                                      // Create a new output file for each iteration, named "aftresplitX.txt" (X is the file number)
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IO\\aftresplit" + i + ".txt"));

		                                                	// 5. Write 'nol' lines into each output file
			for (int j = 1; j <= nol; j++) {
				str = br.readLine();                      // Read the next line from the input file

				                                        // If there is a line to write (i.e., the end of the input file hasn't been reached)
				if (str != null) {
					bw.write(str);                    // Write the line to the output file

					                                // 6. Check if this is not the last line to be written to the current output file
					if (j != nol) {
						bw.newLine();             // Write a newline (move to the next line in the file) unless it's the last line
					}
				}
			}
			bw.close();
			
}
	}
}