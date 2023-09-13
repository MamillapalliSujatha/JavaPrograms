package com.FileHandling;

import java.io.FileReader;
import java.io.IOException;
public class Count {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("f1.txt");
		int i;
		int c=0;
		while ((i = fr.read()) != -1) {
			//System.out.print((char)i);
			c++;
	}
	System.out.println(c);

}
	
}
