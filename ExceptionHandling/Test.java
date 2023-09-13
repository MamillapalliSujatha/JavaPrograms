package com.ExceptionHandling;

public class Test {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("try block started");
			String s="hello";
			s.length();
			System.out.println("try block end");
		}
		catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("catch block excecuted");
		}
		finally {
			System.out.println("finally block excecuted");
		}
	}

}
