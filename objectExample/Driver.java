package com.objectExample;

public class Driver {

	public static void main(String[] args) {
		Driver d=new Driver();
		Student s=new Student();
		s.id=101;
		s.name="sujatha";
		d.print(s);
	}
	void print(Student s) {
		System.out.println(s.id+" "+s.name);
	}

}
