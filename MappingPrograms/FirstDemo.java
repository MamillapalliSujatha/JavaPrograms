package com.MappingPrograms;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {

	public static void main(String[] args) {
		Person p1=new Person("siri","USA");
		Person p2=new Person("Navya","India");
		Person p3=new Person("Anusha","Japan");
		Person p4=new Person("Kavya","USA");
		
		List<Person> persons=Arrays.asList(p1,p2,p3,p4);
		
		 boolean status=persons.stream().anyMatch(p->p.name.equals("Karuna"));
		 System.out.println("Any Indian available? "+status);
	}

}

class Person{
	String name;
	String nation;
	Person(String name,String nation){
		this.name=name;
		this.nation=nation;
	}
}
