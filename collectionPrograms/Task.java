package com.collectionPrograms;

import java.util.*;
public class Task {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add("sujatha");
		al.add("chandini");
		al.add("jamal");
		al.add("7");
		Iterator<Object> itr=al.iterator();
		System.out.println(al);
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
	}

}
