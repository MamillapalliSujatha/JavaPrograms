package com.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SameName {
	public static void main(String[] args) throws IOException {
		
		String file = "data.txt";
		String file1 = "ashokit.txt";
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		FileReader fr1 = new FileReader(file1);
		BufferedReader br1 = new BufferedReader(fr1);
		
		String line;
		
		String s1 = "";
		String s2 = "";
		
		while ((line = br.readLine()) != null) {
			s1+= line;
		}
		
		while ((line = br1.readLine()) != null) {

			s2 +=line;
		}
		
		 String[] words1 = s1.split(" ");
		 
	        String[] words2 = s2.split(" ");
	        
	        System.out.println("Common words in both files:");
	        
	        for (String word1 : words1) {
	            for (String word2 : words2) {
	                if (word1.trim().equalsIgnoreCase(word2.trim())) {
	                	
	                    System.out.println(word1);
	                    break;
	                }
	            }
	       }
	}

}

