package com.MappingPrograms;

import java.util.*;

class Employee{
	String name;
	int age;
	double salary;
	Employee(String name, int age, double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
}

public class EmployeeDemo {


	public static void main(String[] args) {
		Employee e1=new Employee("sujatha",20,20000);
		Employee e2=new Employee("nandu",25,30000);
		Employee e3=new Employee("sravani",40,70000);
		Employee e4=new Employee("priya",23,24000);
		Employee e5=new Employee("nandu",43,55000);
		Employee e6=new Employee("Karuna",28,55000);
		Employee e7=new Employee("priya",33,55000);
		
		List<Employee> emp=Arrays.asList(e1,e2,e3,e4,e5,e6,e7);
	    emp.stream().filter(e->e.salary>=50000).forEach(e->System.out.println(e.name+" -"+e.age));
	    
	    System.out.println("-----------------------------------");
	    emp.stream().limit(3).forEach(c->System.out.println(c));
	    
	    
	    boolean status=emp.stream().anyMatch(p->p.name.equals("Karuna"));
	    System.out.println("Any Indian available? "+status);
	    
	    boolean status1=emp.stream().allMatch(p->p.name.equals("Karuna"));
	    System.out.println("All from India "+status1);
	    
	    
	    
	
	}

}
