package com.CollectorsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByDemo {

	public static void main(String[] args) {
		Employees e1=new Employees("sujatha",20,20000,"india");
		Employees e2=new Employees("nandu",25,30000,"usa");
		Employees e3=new Employees("sravani",40,70000,"chaina");
		Employees e4=new Employees("priya",23,24000,"india");
		Employees e5=new Employees("arun",43,55000,"japan");
		List<Employees> list = Arrays.asList(e1,e2,e3,e4,e5);
		Map<String,List<Employees>> data=list.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(data);
	}

}

class Employees{
	String name;
	int age;
	double salary;
	String country;
	Employees(String name, int age, double salary, String country) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.country = country;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", salary=" + salary + ", country=" + country + "]";
	}
}
