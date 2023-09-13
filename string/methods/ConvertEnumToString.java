package com.string.methods;

public class ConvertEnumToString {
	enum Colours {
		red,
		blue,
		green;
	}

	public static void main(String[] args) {
		System.out.println(Colours.red.name());
		System.out.println(Colours.blue.name());
		System.out.println(Colours.green.name());
		System.out.println(Colours.red.toString());
	}

}
