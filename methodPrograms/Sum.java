package com.methodPrograms;

public class Sum {

	public static void main(String[] args) {
		int x=4;
		int y=7;
		Sum s=new Sum();
		int c=s.add(x,y);
		System.out.println("sum of two numbers:"+c);
	}

	private int add(int a, int b) {
		return a+b;
	}

}
