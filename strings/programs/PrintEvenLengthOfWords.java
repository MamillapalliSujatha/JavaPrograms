package com.strings.programs;

public class PrintEvenLengthOfWords {

	public static void main(String[] args) {
	    String s="this is sujatha";
        for(String words :s.split(" ")) {
			if(words.length()%2==0) 
				System.out.println(words);	
        }
	}
}

		 
