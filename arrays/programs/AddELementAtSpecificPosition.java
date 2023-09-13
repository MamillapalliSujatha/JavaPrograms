package com.arrays.programs;

public class AddELementAtSpecificPosition {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6};
		int num=8;
		int pos=3;
		arr[pos]=num;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
