package com.methodPrograms;

public class CheckSpecialCharacters {

	public static void main(String[] args) {
		String s="hello6 world2@$";
		CheckSpecialCharacters ch=new CheckSpecialCharacters();
		ch.specialCharacters(s);
	}

	private void specialCharacters(String s) {
		int c=0;
		for(int i=0;i<s.length();i++) {
			 if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && 
					 !Character.isWhitespace(s.charAt(i))) 
				 c++;		 
		}
	    if(c==0) 
	    	System.out.println("no special characters in string");
	    else 
	    	System.out.println("string contain special characters");
	}
	
}
