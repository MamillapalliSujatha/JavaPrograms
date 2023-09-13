package com.FileHandling;

import java.io.File;

public class FilesDirectory {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\sujat\\Documents\\workspace-spring-tool-suite-4-4.18.1.RELEASE\\SampleProject");
		String[] arr=f.list();
		for(String name:arr) {
			File f1=new File(f,name);
			if(f1.isFile())
				System.out.println("File::"+name);
			if(f1.isDirectory())
				System.out.println("Directory::"+name);
		}
	}

}
