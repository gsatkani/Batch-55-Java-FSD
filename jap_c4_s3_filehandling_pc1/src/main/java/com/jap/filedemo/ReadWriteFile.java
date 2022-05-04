package com.jap.filedemo;

import java.io.*;

public class ReadWriteFile {

	public static void main(String[] args) {
		ReadWriteFile readWriteFile = new ReadWriteFile();
		try {
			readWriteFile.readDataFromFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// create object of Readers and writers
	public void readDataFromFile() throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		String line = reader.readLine();

		String[] split = line.split(",");
		String sum = "";
		for (String string : split) {

			sum = sum + string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase() + ",";
			System.out.println(sum);

		}

		System.out.println(line);

		reader.close();
		BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
		writer.write(sum.substring(0, sum.length()-1));
		writer.close();
		

	}
}
