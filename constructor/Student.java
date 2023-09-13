package com.constructor;

public class Student {
	int id;
	String name;
	int age;
	String gender;
	public static void main(String[] args) {
		Student s1 = new Student(1, "Raju", 20, "Male");
		Student s2 = new Student(1, "Rani", 22, "FeMale");
	}
	public Student(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(this.id + "--" + this.name + "--" + this.age + "--" + this.gender);
	}

}
