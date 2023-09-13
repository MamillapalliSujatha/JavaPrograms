package com.strings.programs;

public class StringContainOnlyDigits {

	public static void main(String[] args) {
		String s="hello@123";
		int len=s.length();
		int c=0;
		for(int i=0;i<len;i++) {
			if(Character.isDigit(s.charAt(i))) {
				c++;
			}
		}
		if(c==len)
			System.out.println("String contain only digits");
		else
			System.out.println("string is contsin not only digits");

	}

}
