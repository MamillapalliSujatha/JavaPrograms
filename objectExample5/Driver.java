package com.objectExample5;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();
		Person p = d.m1();
		System.out.println(p.id + "--" + p.name + "--" + p.age);

	}

	Person m1() {
		Person p = new Person();
		p.id = 101;
		p.name = "Rani";
		p.age = 32;

		return p;
	}

}
