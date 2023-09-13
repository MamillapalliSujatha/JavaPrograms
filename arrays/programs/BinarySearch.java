package com.arrays.programs;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {2,10,40,8,5,32};
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
		for( int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int n=40;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("number "+ n +" is placed index:"+i);
			}
		
		}

	}

}
