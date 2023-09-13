package com.strings.programs;

public class ConvertFloatToString {

	public static void main(String[] args) {
		float f=2.45f;
		double d=5.46;
		String s=String.valueOf(f);
		String str=String.valueOf(d);
		System.out.println(s);
		System.out.println(str);
		if(s instanceof String)
			System.out.println("true");
		if(str instanceof String)
			System.out.println("true");
	}

}
