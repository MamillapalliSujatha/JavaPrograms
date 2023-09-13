package com.string.methods;

import java.util.Arrays;

public class SplitMethod {

	public static void main(String[] args) {
		String s1="hi@hello@how are@you";
		String[] arr=s1.split("@");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));

	}

}
