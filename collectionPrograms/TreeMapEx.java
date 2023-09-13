package com.collectionPrograms;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		Map<Integer,String> m=new TreeMap<>();
		m.put(4,"hi");
		m.put(3,"jammu");
		m.put(6,"sun");
		m.put(1,"moon");
		System.out.println(m);
		Set s=m.keySet();
		Collection<String> c=m.values();
		Set s1=m.entrySet();
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
