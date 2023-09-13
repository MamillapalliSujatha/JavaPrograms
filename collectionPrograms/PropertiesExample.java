package com.collectionPrograms;

import java.util.*;
import java.io.*;
public class PropertiesExample {
	// Java program to demonstrate Properties class to get
	// information from the properties file
	public static void main(String[] args) throws Exception
	{
		// create a reader object on the properties file
		FileWriter reader = new FileWriter("db.properties");
		FileReader reader1 = new FileReader("db.properties");

		// create properties object
		Properties p = new Properties();

		// Add a wrapper around reader object
		p.load(reader1);

		// access properties data
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}
}


