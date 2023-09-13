package com.arrays.programs;

public class CountRepeatedElements {

	public static void main(String[] args) {
		int[] arr= {2,3,4,2,5,4,7,8,3,3,2,5};
        int c=0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count>=1) {
				c++;
			}
		}
		System.out.println("repeated elements count:"+c);
	}

}
