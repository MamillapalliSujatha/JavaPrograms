package com.strings.programs;

public class ConvertShortToString {

	public static void main(String[] args) {
		short s=5;
		String str=String.valueOf(s);
		System.out.println(str);
		if(str instanceof String) {
			System.out.println("true");
		}
	}

}
