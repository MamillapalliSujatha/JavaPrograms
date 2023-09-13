package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriters {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("data.txt");
		fw.write("hi,good evening");
		fw.write("\n");
		fw.write("how are you");
		fw.write("hi,good evening");
		fw.flush();
		fw.close();
	}

}
