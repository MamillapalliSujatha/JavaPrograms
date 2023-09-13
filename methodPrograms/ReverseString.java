package com.methodPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String s="this is sujatha";
		ReverseString ref=new ReverseString();
		ref.reverse(s);
	}

	private void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		                                    
	}

}
