package com.strings.programs;

public class RemovingLowerUpperSpecialNonspecial {

	public static void main(String[] args) {
		String s="Hello@#234WelCome";
		
		System.out.print("after removing digits:");
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();		
		System.out.print("after alphabets :");
		for(int i=0;i<s.length();i++) {
			if(!Character.isLetter(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();	
		System.out.print("after removing special characters:");
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) ) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
