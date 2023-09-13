package com.arrays.programs;

public class Ex {

	public static void main(String[] args) {
		String[] arr= {"hi","hello","how"};
		String word=arr[0];

		int index = 0;

		for (int i=1;i<arr.length;i++) {

			if(word.length()>arr[i].length()) {

				word= arr[i];

				index =i;

			}

		}
		System.out.println(word);
	}

}
