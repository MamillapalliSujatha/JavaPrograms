package com.strings.programs;

public class MoveUppercaseCharactersToEnd {

	public static void main(String[] args) {
		String s="HeLlo";
		String u="";
		String l="";
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				u=u+s.charAt(i);
			}
			else if(Character.isLowerCase(s.charAt(i))){ 
					l=l+s.charAt(i);
			}
			
		}
		String str=l+u;
		System.out.println(str);
		    
	}

}
