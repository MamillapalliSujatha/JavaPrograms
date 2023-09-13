package com.strings.programs;

public class FindLostNumber {

	public static void main(String[] args) {
		String s="1 2 5 3 7 6";
		int c=s.split(" ").length - 1;
		if(s.indexOf(Integer.toString(c)) != -1) {
			System.out.println(c);
		}
		else {
			System.out.println(-1);
		}
		
	}

}
