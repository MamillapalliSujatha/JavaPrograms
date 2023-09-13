package com.FileHandling;

import java.io.PrintWriter;

public class PrintWriterEx2 {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("f1.txt");
		pw.write("this is my f1 file data");
		pw.flush();
		pw.close();

	}

}
