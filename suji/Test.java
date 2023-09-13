package com.suji;

import java.util.function.BiFunction;

public class Test {

	public static void main(String args[]) {
		BiFunction<Integer,Integer,Integer> f = (a,b) -> (a+b);
		System.out.println(f.apply(10,20));
	}

	
}
