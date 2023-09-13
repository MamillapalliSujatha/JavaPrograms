package com.strings.programs;

public class SwapFirstAndLastCharacters {

	public static void main(String[] args) {
		String s="helloWorld";
		char[] ch=s.toCharArray();
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		System.out.println(ch);
	}

}
