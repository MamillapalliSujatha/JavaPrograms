package com.FileHandling;

import java.io.*;
public class BufferRead {
	public static void main(String... args) throws IOException {			
		FileReader fr = new FileReader("data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine ( ); // reading first line data

		while ( line != null ) {
			System.out.println( line );		
			line = br.readLine ( ) ; // reading next line and re-initialzing line variable
		}		
	}
}
