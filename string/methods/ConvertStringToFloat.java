package com.string.methods;

public class ConvertStringToFloat {

	public static void main(String[] args) {
		String s="120";
		float f=Float.parseFloat(s);
		System.out.println(f);
		
		float f1=Float.valueOf(s);
		System.out.println(f1);
	}

}
