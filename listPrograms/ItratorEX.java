package com.listPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItratorEX {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(5);
		l.add(7);
		l.add(6);
		l.add(8);
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
