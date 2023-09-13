package com.ExceptionHandling;

public class NeastedTry {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("try block started");
			int c=10/0;
			System.out.println(c);
			try {
				String s = null;
				s.length();
			}
			catch(NullPointerException e) {
				//e.printStackTrace();
				System.out.println(e);
			}
			System.out.println("try-catch block end");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block excecuted");
		}
	}

}
