package com.operators.suji;

public class PreincrementOperator {

	public static void main(String[] args) {
		int a=3;
		int b=5;
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(b++ + ++b + --b + b--);
		
		System.out.println(++b + ++b + --b + ++b);
		
		System.out.println(b-- + b++ + --b + b--);
		
		System.out.println(b++ + ++b + --a + a--);
		
		System.out.println(b++ + ++b + --b + b--);
		
		System.out.println(b++ + ++b + --b + b--);
		
		System.out.println(b++ - ++b - --b + b--);
		
	}

}
