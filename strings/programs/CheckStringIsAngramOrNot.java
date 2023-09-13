package com.strings.programs;

import java.util.Arrays;

public class CheckStringIsAngramOrNot {

	public static void main(String[] args) {
		String s1="file";
		String s2="life";
		if(s1.length()!=s2.length()) {
			System.out.println("string is not anagram");
		}
		else {
			char[] ch1=s1.toLowerCase().toCharArray();
			char[] ch2=s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
				System.out.println("string is angram");
			else
				System.out.println("string is not anagram");
		}
	}

}
