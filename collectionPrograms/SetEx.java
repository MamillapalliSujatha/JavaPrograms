package com.collectionPrograms;

import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		Set<Object> s=new LinkedHashSet<Object>(); 
		s.add(5);
		s.add("hello");
		s.add(5);
		s.add(null);
		s.add("suji");
		s.add(null);
		System.out.println(s);
		System.out.println(s.size());
	}

}
