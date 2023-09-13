package com.strings.programs;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
			if(str1.equals(str2))
				System.out.println("string are same");
			else
				System.out.println("String are not same");
		}
		else {
			System.out.println("String are not same");
		}

	}

}
