package com.methodPrograms;

public class StringLength {

	public static void main(String[] args) {
		String name="sujatha";
		StringLength s=new StringLength();
		int length=s.findLength(name);
		System.out.println("length of name:"+length);
	}

	private int findLength(String name) {
		int l=name.length();
		return l;
	}

}
