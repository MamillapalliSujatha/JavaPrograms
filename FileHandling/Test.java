package com.FileHandling;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\sujat\\Documents\\workspace-spring-tool-suite-4-4.18.1.RELEASE\\SampleProject");
		String[] arr=f.list();
		for(String name:arr) {
			System.out.println(name);
		}
	}

}
