package com.arrays.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
	    numbers.add(2);
	    numbers.add(4);
	    numbers.add(5);
	    numbers.add(8);
	    numbers.add(10);
	    
	    System.out.println(numbers);
	        
	    Iterator<Integer> itr = numbers.iterator();
	        
	    while(itr.hasNext()) {
	    	Integer number = itr.next();
	        if(number % 2 == 0) {
	        	itr.remove();
	        }
	    }
	        
	    for(Integer num: numbers) {
	        System.out.println(num);
	    }
	        
	}

}
