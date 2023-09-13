package com.collectionPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ArrayExp {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(5,3,8,2,9);
		System.out.println(al);
		
		/*
		 * Integer arr[]=al.toArray(new Integer[1]); Arrays.stream(arr).forEach((i)->
		 * System.out.println(i));
		 */
		
		/*
		 * Collections.sort(al); System.out.println(al);
		 * 
		 * int binarySearch = Collections.binarySearch(al, 8);
		 * System.out.println(binarySearch);
		 * 
		 * Comparator<Integer> c=(a,b)->a.compareTo(b); int bs1 =
		 * Collections.binarySearch(al, 8, c); System.out.println(bs1);
		 * 
		 * Collections.reverse(al); System.out.println(al);
		 */
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		
		
		
	}

}

