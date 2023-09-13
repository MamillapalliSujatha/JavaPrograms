package com.strings.programs;

public class ReplaceCharacterAtSpecificIndex {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
	    str.setCharAt(3, 'f');
	    System.out.println(str);
	    StringBuffer s = new StringBuffer("world");
        s.setCharAt(3, 'h');
        System.out.println(s);
	}

}
