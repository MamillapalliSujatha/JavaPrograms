package com.arrays.programs;

public class AddElementToArray {

	public static void main(String[] args) {
		int[] arr= {7,45,4,35,6};
		int num=8;
		int[] newArr=new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		newArr[arr.length]=num;
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
	}

}
