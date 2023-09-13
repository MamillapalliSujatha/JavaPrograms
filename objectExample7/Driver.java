package com.objectExample7;

public class Driver {

	public static void main(String[] args) {
		Driver d=new Driver();
		Person person=d.m1(101);
		System.out.println(person.id + "---" + person.name);
	}

	private Person m1(int id) {
		Person p = new Person();
		if (id == 101) {
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		} else if (id == 102) {
			p.id = 102;
			p.name = "Rani";
			p.age = 32;
		}
		return p;
	}

}
