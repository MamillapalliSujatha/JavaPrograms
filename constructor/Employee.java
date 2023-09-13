package com.constructor;

public class Employee {
	String name;
	float salary;
	public static void main(String[] args) {
		Employee emp = new Employee("Raju", 55000.00f);
	}
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
		System.out.println(this.name + "--" + this.salary);
	}

	

}
