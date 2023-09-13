package com.inheritence;

public class Student extends User {
	int rank;
	public static void main(String[] args) {
		Student s=new Student();
		s.rank=1;
		s.id=101;
		s.name="suji";
		System.out.println(s.id+" --- "+s.name+" --- "+s.rank);
	}

}
