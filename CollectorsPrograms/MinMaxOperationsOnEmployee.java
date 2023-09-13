package com.CollectorsPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMaxOperationsOnEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee("sujatha",20,20000);
		Employee e2=new Employee("nandu",25,30000);
		Employee e3=new Employee("sravani",40,70000);
		Employee e4=new Employee("priya",23,24000);
		Employee e5=new Employee("nandu",43,55000);
		List<Employee> empDetails=Arrays.asList(e1,e2,e3,e4,e5);
		Optional<Employee> max= empDetails.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("Max salary:"+max.get().salary);
		
		Optional<Employee> min= empDetails.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min salary:"+min.get().salary);
		
		Double avg= empDetails.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println("Avg salary:"+avg);		
	}
}

class Employee{
	String name;
	int age;
	double salary;
	Employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
