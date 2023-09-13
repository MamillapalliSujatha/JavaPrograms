package com.string.methods;


public class EqualsMethod {
	public static void main() {
		String s1="hello";
		String s2="hello";

		if(s1.equals(s2)) {
			System.out.println("two strings are same");
		}
		else {
			System.out.println("two strings are not same");
		}
		
		if(s1==s2) {
			System.out.println("two strings address are same");
		}
		else {
			System.out.println("two strings address are not same");
		}
	}

}
/* 
 * equals checks the values are same or not
 * ==     checks the address of two strings are same or not 
 */



