package com.methodPrograms;

public class IterateString {

	public static void main(String[] args) {
		String s="helloworld";
		IterateString is=new IterateString();
		is.iterateMethod(s);
	}

	private void iterateMethod(String str) {
		for(int i=0;i<str.length();i++)
			System.out .print(str.charAt(i)+" ");
	}

}
