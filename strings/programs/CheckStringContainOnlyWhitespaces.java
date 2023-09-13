package com.strings.programs;

public class CheckStringContainOnlyWhitespaces {

	public static void main(String[] args) {
		String s="      ";
		if(s.trim().isEmpty())
			System.out.println("String contain only whitespaces");
		else
			System.out.println("String contain not only whitespaces");
	}

}
