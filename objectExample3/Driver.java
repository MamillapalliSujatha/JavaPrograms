package com.objectExample3;

public class Driver {

	public static void main(String[] args) {
		Driver d = new Driver();
		Docter d1 = new Docter();
		d1.name = "Rathod";
		d1.age = 29;
		d.print(d1);
	}
	void print(Docter d) {
		System.out.println(d.name + " " + d.age);
	}

}
