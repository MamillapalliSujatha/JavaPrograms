package com.collectionPrograms;

import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<Object>();
		v.add(5);
		v.add("hi");
		v.add(4);
		v.add(3);
		v.add(6);
		v.add(6);
		v.add(6);
		v.add("hi");
		v.add("hello");
		v.add("hi");
		v.add("hi");
		v.add("hi");
		v.add("hi");
		v.addElement("hi");
		v.remove(10);
		v.removeElement(6);
		System.out.println(v);
		System.out.println(v.size());
	}

}
