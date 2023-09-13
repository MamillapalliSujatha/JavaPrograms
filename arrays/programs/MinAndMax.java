package com.arrays.programs;

public class MinAndMax {

	public static void main(String[] args) {
		int[] arr= {2,1,49,8,5};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
			
		}
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("min value"+arr[0]);
		System.out.println("min value"+arr[arr.length-1]);
		System.out.println("Second largest number:"+arr[arr.length-2]);
		
	}

}
