package com.strings.programs;

public class PrintFirstKCharacters {

	public static void main(String[] args) {
		String s="HelloWorld";
		int k=5;
		for(int i=0;i<k;i++) {
			System.out.print(s.charAt(i));
		}
	}

}
