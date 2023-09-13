
package com.arrays.programs;

public class AddTwoArrays {

	public static void main(String[] args) {
		int[] arr1= {2,3,4,5};
		int[] arr2= {4,5,6,3};
		int[] sum=new int[4];
		for(int i=0;i<sum.length;i++) {
			sum[i]=arr1[i]+arr2[i];
		}
		System.out.println("Sum of two arrays with equal length:");
		for(int i=0;i<sum.length;i++) {
			System.out.print(sum[i]+" ");
		}
	}

}
