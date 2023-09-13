package com.collectionPrograms;

import java.util.*;

public class SynMap extends Thread{
	static Map<Integer,String> m = new HashMap<>();
	public void run()
	{
		m.put(4,"Muffins");
		m.put(5,"Desserts");
		m.put(6,"Tortillas");
		m.put(7,"Biryani");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread()+"update List" + m);	
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread()+"updating map" );
		SynMap t1 = new SynMap();
		t1.start();
		Map<Integer,String> synmap= Collections.synchronizedMap(m);
		synmap.put(1,"Crossiant");
		synmap.put(2,"Breads");
		synmap.put(3,"Cookies");
		Set s1=m.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey()+"...."+m1.getValue()+" ");
			Thread.sleep(500);
		}
	}

}
