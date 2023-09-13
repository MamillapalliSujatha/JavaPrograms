package com.strings.programs;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		String s="hello@2world6";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				c++;
			}
		}
		System.out.println("Number of digits in a string:"+c);
	}

}
