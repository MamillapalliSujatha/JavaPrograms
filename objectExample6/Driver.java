package com.objectExample6;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();
		College c = d.m1();
		System.out.println(c.id + "----" + c.name);
	}

	private College m1() {
		College c = new College();
		c.id = 101;
		c.name = "HITM";
		return c;
	}

}
