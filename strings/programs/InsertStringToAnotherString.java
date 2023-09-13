package com.strings.programs;

public class InsertStringToAnotherString {
	public static void main(String ars[]) {
		StringBuffer s1=new StringBuffer("greek greeks");
		s1.insert(6,"for ");
		System.out.println(s1);
	}
}
