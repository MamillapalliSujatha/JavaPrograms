package com.FileHandling;

import java.io.*;
public class DataRead{
	
		public static void main(String[] args) throws IOException {		

			FileReader fr = new FileReader ("data.txt");
			int  i = fr.read ( );

			while ( i != -1 ){
				System.out.print( (char) i );
				i = fr.read ( );	// read next character and re-initialize i var
			}
			fr.close ( );
		}
}
