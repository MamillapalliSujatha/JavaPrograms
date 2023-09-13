package com.arrays.programs;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {2,6,16,4,9,15,22};
		int n=4;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("number "+ n +" is placed index:"+i);
			}
		}

	}

}
