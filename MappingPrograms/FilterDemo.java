package com.MappingPrograms;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> n= Arrays.asList(1,6,3,5,7,2,4);
		System.out.println(n);
		
		n.stream().filter(v->v%2==0).forEach(System.out::println);
	}

}
