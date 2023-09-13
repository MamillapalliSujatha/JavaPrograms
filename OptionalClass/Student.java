package com.OptionalClass;

import java.util.Optional;

public class Student {
	public Optional<String> getUserNameById(Integer id) {
		String name=null;
		if(id==100) {
			return Optional.ofNullable("raju");
		}
		else if(id==101) {
			return Optional.ofNullable("sujatha");
		}
		else if(id==102) {
			return Optional.ofNullable("jamal");
		}
		return Optional.ofNullable(name);
	}
	

}
