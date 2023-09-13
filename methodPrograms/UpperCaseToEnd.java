package com.methodPrograms;

public class UpperCaseToEnd {
	String u="";
	String l="";
	public static void main(String[] args) {
	UpperCaseToEnd ref=new UpperCaseToEnd();
	String s="HeLlo";
	String result="";
	result=ref.method(s);
	System.out.println(result);
	}

	private String method(String str) {
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				u=u+str.charAt(i);
			}
			else if(Character.isLowerCase(str.charAt(i))){ 
					l=l+str.charAt(i);
			}
			
		}
		String r=l+u;
		return r;
		
	}

}
