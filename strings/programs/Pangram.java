package com.strings.programs;

public class Pangram {

	public static void main(String[] args) {
		String str = "WelcometoVtalent";
		str = str.toLowerCase();
		boolean allLetterPresent = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {

			if (!str.contains(String.valueOf(ch))) {
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
  