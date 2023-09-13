package com.constructor;

public class Parameterized {

	String language;
	public static void main(String[] args) {
		Parameterized p=new Parameterized("java");
		Parameterized p1=new Parameterized("c");
		
	}
	Parameterized(String language){
		System.out.println("language is:"+language);
	}
}
 