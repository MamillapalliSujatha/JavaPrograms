package com.ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("try block started");
			int c=10/0;
			System.out.println(c);
			String s = null;
			s.length();
			
			System.out.println("try block end");
		}
		
		catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally block excecuted");
		}
	}

}
