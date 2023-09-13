package com.collectionPrograms;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "a");
		m.put(6, "f");
		m.put(4, "g");
		m.put(1,"z");
		//System.out.println(m.size());
		Set s=m.keySet();
		Collection<String> c=m.values();
		Set si=m.entrySet();
		
		for(Entry<Integer, String> e:m.entrySet()) { System.out.println(e); }
		 
		//lambda expression
		//m.forEach((k,v)->System.out.println(k+"-"+v));
		
		//Iterator i=si.iterator();
		/*
		 * while(i.hasNext()) { Map.Entry next = (Entry) i.next();
		 * System.out.println(next.getKey()); }
		 */
	}

}
