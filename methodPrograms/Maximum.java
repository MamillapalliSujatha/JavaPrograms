package com.methodPrograms;

public class Maximum {

	public static void main(String[] args) {
		int[] arr= {5,3,8,2,9,1};
		Maximum m=new Maximum();
		int[] a=m.max(arr);
		System.out.println("maximum element in array:"+a[a.length-1]);
		int large=m.maxElement(arr);
		System.out.println("maximum element in array:"+large);
	}

	private int maxElement(int[] arr) {
		int l=arr[0];
		for( int i=0;i<arr.length;i++) {
			if(l<arr[i])
				l=arr[i];
		}
		return l;	
	}

	private int[] max(int[] arr) {
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
		return arr;
	}

}
