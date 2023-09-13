package com.strings.programs;


public class CheckStringContainAlphabetsOnly {

	public static void main(String[] args) {
		String s="hello";
		int len=s.length();
		int c=0;
		for( int i=0;i<len;i++) {
			if(Character.isLetter(s.charAt(i)))
				c++;
		}
		if(c==len) {
			System.out.println(s+" String contain alphabets only");
				
		}
		else
			System.out.println("string contain not only alphabets");
	}

}
