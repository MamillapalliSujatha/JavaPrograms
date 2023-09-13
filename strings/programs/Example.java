package com.strings.programs;

public class Example {

	public static void main(String[] args) {
		String str1=args[0];
		String rev="";
		for(int i=str1.length()-1;i>=0;i--){
			rev=rev+str1.charAt(i);
		}
		System.out.println(rev);
	}
}
