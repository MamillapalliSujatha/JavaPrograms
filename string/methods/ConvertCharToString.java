package com.string.methods;

public class ConvertCharToString {

	public static void main(String[] args) {
		char c='a';
		String s=""+c;
		//convert char to string using concatenation
		System.out.println(s);
		
		//convert char to string using toString
		String s1=Character.toString(c);
		System.out.println(s1);
		
	/*	Character ch=new Character('v');
		System.out.println(ch.toString());
	*/
		}
}

