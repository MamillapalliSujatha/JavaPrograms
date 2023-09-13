package com.methodPrograms;

public class CompareStrings {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Hello";
		CompareStrings cs=new CompareStrings();
		cs.Strings(s1,s2);
	}

	private void Strings(String a1,String a2) {
		String str1=a1.toLowerCase();
		String str2=a2.toLowerCase();
		if(str1.length()==str2.length()) {
			if(str1.equals(str2))
				System.out.println("string are same");
			else
				System.out.println("String are not same");
		}
		else {
			System.out.println("String are not same");
		}
	}

}
