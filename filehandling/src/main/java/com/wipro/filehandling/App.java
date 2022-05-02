package com.wipro.filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BufferedReader reader = null;
		FileReader fr = null;
		try {
			fr = new FileReader("data.txt");
			reader = new BufferedReader(fr);
			String line="";	
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Check file in project folder");
		} catch (IOException ex) {
			System.out.println("Device is not ready");
		}

		finally {
			try {
				fr.close();
				reader.close();
			} catch (IOException ex) {
				System.out.println("Close");
			}

		}

	}
}
