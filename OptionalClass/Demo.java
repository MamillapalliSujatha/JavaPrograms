package com.OptionalClass;

import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter id:");
		int id=sc.nextInt();
		Student s=new Student();
		Optional<String> sname=s.getUserNameById(id);
		if(sname.isPresent()) {
			String name=sname.get();
			System.out.println(name.toUpperCase()+" hello");
		}
		else {
			System.out.println("data not found");
		}

	}

}
