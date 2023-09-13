package com.strings.programs;

public class Demo {
	
	int id;
	String name;
	public static void main(String[] args) {
		Demo d=new Demo();
		d.id=101;
		d.name="Suji";
		System.out.println(d);
		System.out.println(d.toString());
		
		String d1=new String("hi");
		System.out.println(d1);
	}
	public String toString() {
		return id+"---"+name;
	}
}
