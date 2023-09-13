package com.strings.programs;

public class ConvertStringToIntegerArray {

	public static void main(String[] args) {
		String str=" 1 2 34 23 456";
		System.out.print("[");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println("]");
	}

}
