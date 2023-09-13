package com.CollectorsPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		Person p1=new Person("pavani","japan");
		Person p2=new Person("Tharun","India");
		Person p3=new Person("kumanr","china");
		Person p4=new Person("pavani","japan");
		Person p5=new Person("avani","India");
		
		List<Person> persons=Arrays.asList(p1,p2,p3,p4,p5);
		List<Person> indians=persons.stream().filter(p->p.country.equals("India")).collect(Collectors.toList());
		indians.forEach(i->System.out.println(i));
	}

}

class Person{
	String name;
	String country;
	Person(String name,String country){
		this.name=name;
		this.country=country;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", country=" + country + "]";
	}
	
	
}
