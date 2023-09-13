package com.strings.programs;
import java.util.*;

public class PrintAllSubStrins {

	public static void main(String[] args) {
		String s="hello";
		ArrayList<String> str= new ArrayList<String>();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				str.add(s.substring(i,j));			}
		}
		System.out.println(str);                         
	}

}
