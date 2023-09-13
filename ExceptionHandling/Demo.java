package com.ExceptionHandling;

public class Demo {

	private static String s;

	public static void main(String[] args){
		System.out.println("main method started");
		try {
			System.out.println("try block started");
			s = null;
			s.length();
			System.out.println("try block end");
		}
		catch(NullPointerException e) {
			//e.printStackTrace();
			System.out.println(e);
		}
		finally {
			System.out.println("finally block excecuted");
		}
	}

}
