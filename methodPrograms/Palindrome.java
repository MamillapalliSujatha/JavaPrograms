package com.methodPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		s=s.toLowerCase();
		Palindrome ref=new Palindrome();
		String result=ref.method(s);
		if(result.equals(s))
			System.out.println("string is palindrome");
		else
			System.out.println("String is not palindrome");
	}

	private String method(String s) {
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		return str;
	}

}
