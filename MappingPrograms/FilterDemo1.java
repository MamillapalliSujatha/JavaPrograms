package com.MappingPrograms;

import java.util.stream.Stream;

public class FilterDemo1 {

	public static void main(String[] args) {
		User u1=new User(20,"suji");
		User u2=new User(30,"pavani");
		User u3=new User(23,"siri");
		User u4=new User(42,"kavya");
		User u5=new User(37,"ravi");
		
		
	    Stream<User> userDetails=Stream.of(u1,u2,u3,u4,u5);
	  /* userDetails.filter(u->u.age>30).forEach(u->System.out.println(u)); */
		 		
		/*
		 * userDetails.filter(u->u.age>30).filter(u->u.name.startsWith("r")).forEach(u->
		 * System.out.println(u));
		 */
		
		userDetails.filter(u->u.age>30 && u.name.startsWith("r")).forEach(u->System.out.println(u));

	}

}
