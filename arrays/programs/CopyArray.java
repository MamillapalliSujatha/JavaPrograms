package com.arrays.programs;

public class CopyArray {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5};
		int[] arr2=new int[5];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("new array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
