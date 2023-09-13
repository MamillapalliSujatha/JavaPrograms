package com.CollectorsPrograms;


import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		String input="ILoveWatchingCricketWithMyFriends";
        Set<String> s= new HashSet();
		Set<String> collect = Arrays.stream(input.toLowerCase().split("")).filter(e->!s.add(e)).collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println(s);
		
	}

}
