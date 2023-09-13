package com.methodPrograms;

public class CountDigits {

	public static void main(String[] args) {
		CountDigits cd=new CountDigits();
		String s="hello@2world6";
		int c=0;
		int count=cd.countMethod(s,c);
		System.out.println("Number of digits in a string:"+count);
	}

	private int countMethod(String str,int c) {
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				c=c+1;
			}
		}
		return c;
	}

}
