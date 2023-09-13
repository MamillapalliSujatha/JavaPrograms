package com.methodPrograms;

public class Evenwords {

	public static void main(String[] args) {
		String s="this is sujatha";
		Evenwords e=new Evenwords();
		e.method(s);
	}

	private void method(String s) {
        for(String words :s.split(" ")) {
			if(words.length()%2==0) 
				System.out.println(words);	
        }
	}

}
