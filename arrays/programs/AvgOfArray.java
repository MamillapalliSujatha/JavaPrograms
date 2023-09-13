package com.arrays.programs;

public class AvgOfArray {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5};
		int sum=0;
	    for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
	    int avg=sum/(arr.length);
		System.out.println("sum of array values:"+avg);		
	}

}
