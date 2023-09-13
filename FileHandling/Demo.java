package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		File f=new File("ashokit");
		boolean fstatus=f.createNewFile();
		System.out.println(fstatus);
		
		File f1=new File("mkdir");
		boolean f1status=f1.mkdir();
		System.out.println(f1status);
		
		File f2=new File(f1,"data.txt");
		boolean f2status=f2.createNewFile();
		System.out.println(f2status);
		
	}

}
