package com.FileHandling;

import java.io.PrintWriter;
public class PrintWriterEx {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out);
		pw.print("hi ");
		pw.println("hello");
		pw.flush();
		pw.close();
		
	}

}
