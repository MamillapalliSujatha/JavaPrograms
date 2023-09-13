package com.strings.programs;

public class RemoveAllAlphaNonnumaric {

	public static void main(String[] args) {
		String s="d=hello@45,;hi";
		String str="";
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) { 
			}
		}
	}

}
