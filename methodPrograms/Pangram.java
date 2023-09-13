package com.methodPrograms;

public class Pangram {
	public static void main(String[] args) {
		//String str = "WelcometoVtalent";
		String str="The quick brown fox jumps over the lazy dog";
		str = str.toLowerCase();
		Pangram.method(str); 
	}

	private static void method(String s) {
		boolean allLetterPresent = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!s.contains(String.valueOf(ch))) {
				allLetterPresent = false;
				break;
			}
		}
		if (allLetterPresent)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}


}
