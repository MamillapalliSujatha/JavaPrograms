package com.methodPrograms;

import java.util.Arrays;

public class Angram {

	public static void main(String[] args) {
		String s1="file";
		String s2="life";
		boolean result;
		Angram a=new Angram();
		result=a.anagramMethod(s1,s2);
		if(result==true)
			System.out.println("string is angram");
		else
			System.out.println("string is not anagram");
	}

	private boolean anagramMethod(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			char[] ch1=s1.toLowerCase().toCharArray();
			char[] ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
				return true;
			else
				return false;
		}
		
	}

}
