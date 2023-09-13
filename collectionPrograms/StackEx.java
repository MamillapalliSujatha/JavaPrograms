package com.collectionPrograms;

import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<Object>();
		s.push(2);
		s.push("hi");
		s.push("hello");
		s.push(3);
		s.push(8);
		s.push(0);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search(0));

	}

	

}
