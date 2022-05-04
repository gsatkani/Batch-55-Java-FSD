package com.wipro.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTofile {

	public static void main(String[] args) {
		// Writes text to character files using a default buffer size
		FileWriter fileWriter = null;
		// Writes text to a character-output stream, buffering characters so as
		// toprovide for the efficient writing
		BufferedWriter writer = null;
		try {
			// it creates new file if there is no file exists
			fileWriter = new FileWriter("wipro.txt", true);
			
			fileWriter.write("Written by File Writter");
			
			writer = new BufferedWriter(fileWriter);
			
			String msg ="\nWritten by Buffered Writter";
			
			writer.write(msg);
			
			System.out.println("Check the file");

		} catch (IOException e) {
           System.out.println(e.getMessage());
		} finally {
			try {
				//fileWriter.close();
				writer.close();
			} catch (IOException e) {

			}

		}

	}

}
