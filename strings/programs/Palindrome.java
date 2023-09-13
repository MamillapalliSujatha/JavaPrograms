package com.strings.programs;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		s=s.toLowerCase();
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		if(str.equals(s))
			System.out.println("string is palindrome");
		else
			System.out.println("String is not palindrome");
	}

}
