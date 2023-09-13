package com.strings.programs;

public class ReverseString {

	public static void main(String[] args) {
		String s="sujatha";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
