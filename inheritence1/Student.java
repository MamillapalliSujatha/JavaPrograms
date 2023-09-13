package com.inheritence1;

public class Student extends User {
	public static void main(String[] args) {
		User u=new User();
		Student s=new Student();
		s.m1();
		s.m2();
		
	}
	void m2() {
		System.out.println("m2 method is called");
	}
}
