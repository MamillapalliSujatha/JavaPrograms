package com.strings.programs;

public class StringIsPalindromOrNot {

	public static void main(String[] args) {
		String a="madamq";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("given string is palindrom");
		}
		else {
			System.out.println("given string is not a palindrome");
		}
	}

}
