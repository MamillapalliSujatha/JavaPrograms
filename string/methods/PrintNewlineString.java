package com.string.methods;

public class PrintNewlineString {

	public static void main(String[] args) {
		String newline=System.lineSeparator();
		System.out.println("hello" +newline+"world");
		
		System.out.println();
		
		System.out.println("hello" + '\n'+"world");
		
		System.out.println();
		
		System.out.printf("hello%nworld");  
		System.out.println("hello");
		System.out.println("world");

	}

}
