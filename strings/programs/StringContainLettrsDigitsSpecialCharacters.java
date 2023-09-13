package com.strings.programs;

public class StringContainLettrsDigitsSpecialCharacters {

	public static void main(String[] args) {
		String s="hello@123";
		int len=s.length();
		int c=0;
		for(int i=0;i<len;i++) {
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
				c++;
			}
		}
		int sc=0;
		for(int i=0;i<len;i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && 
					!Character.isWhitespace(s.charAt(i)) ) {
				sc++;
			}
		}
		if(len==(sc+c))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
