package com.suji;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		Function<String,Integer> f=(name)->name.length();
		System.out.println(f.apply("sujatha"));
		
		System.out.println("===============================");
		List<Integer> numbers=Arrays.asList(10,20,30,40,50);
		numbers.forEach(i->System.out.println(i));
		
		System.out.println("----------------------------------");
    	Consumer<String> c=name->System.out.println(name+" good morning");
        c.accept("suji");
	}

}
