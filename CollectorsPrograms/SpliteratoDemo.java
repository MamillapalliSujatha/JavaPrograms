package com.CollectorsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratoDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("suji","jamal","chand","akhi");
		Spliterator<String> iterating=names.stream().spliterator();
		iterating.forEachRemaining(n-> System.out.println(n));
	}

}
