package com.collectionPrograms;

import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(6);
		l.add(4);
		l.add(3,7);
		l.add(2,9);
		l.set(3, 10);
		System.out.println(l);
		System.out.println(l.remove(2));
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.indexOf(7));
		
		ListIterator<Integer> li= l.listIterator();
		System.out.println();
		while(li.hasNext()) {
			System.out.println(li.next());
			
		}
		l.clear();
		System.out.println(l.hashCode());
		System.out.println(l.isEmpty());
		System.out.println(l.containsAll(l));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		List al1= Collections.synchronizedList(al);
	}

}
