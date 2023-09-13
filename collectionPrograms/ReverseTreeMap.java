package com.collectionPrograms;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ReverseTreeMap {

	public static void main(String[] args) {
		Map<Object,Object> m=new TreeMap<Object,Object>();
		m.put(1,"suji");
		m.put(2,"jamal");
		m.put(3,"chandini");
		m.put(4,"akhi");
		Set s=m.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
