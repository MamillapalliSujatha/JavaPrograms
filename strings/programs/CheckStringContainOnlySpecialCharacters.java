package com.strings.programs;

public class CheckStringContainOnlySpecialCharacters {

	public static void main(String[] args) {
		String s="#@@%#$$";
		int len=s.length();
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
				c++;
			}
		}
		if(c==len)
			System.out.println("yes");
		else
			System.out.println("no");

	}

}
