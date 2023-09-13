package com.strings.programs;

public class RemoveGivenWordFromString {

	public static void main(String[] args) {
		String s="greek for greeks";
		String str=s.replaceAll("ek","");
		System.out.println(str);
	}

}
