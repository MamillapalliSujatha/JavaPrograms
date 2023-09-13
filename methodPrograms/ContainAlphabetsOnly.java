package com.methodPrograms;

public class ContainAlphabetsOnly {

	public static void main(String[] args) {
		ContainAlphabetsOnly a=new ContainAlphabetsOnly();
		a.alphabets();
	}

	private void alphabets() {
		String s="hello23";
		int len=s.length();
		int c=0;
		for( int i=0;i<len;i++) {
			if(Character.isLetter(s.charAt(i)))
				c++;
		}
		if(c==len)
			System.out.println("String contain alphabets only");
		else
			System.out.println("string contain not only alphabets");
		
	}
	
	

}
