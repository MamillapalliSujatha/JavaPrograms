package com.methodPrograms;

public class Concatination {

	public static void main(String[] args) {
		String first="Mamillapalli ";
		String last="Sujatha";
		Concatination ref=new Concatination();
		String name=ref.concatName(first,last);
		System.out.println("Full Name:"+name);
	}

	private String concatName(String fname,String lname) {
		return fname+lname;
	}

}
