package com.strings.programs;

public class ConvertStringToCharArray {

	public static void main(String[] args) {
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.print(" "+ch[i]);	
	}

}
