package com.MappingPrograms;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Arun","raju","priyanka","anusha");
		names.stream().map(name->name.length()).forEach(System.out::println);
		
	}

}


