package com.arrays.programs;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int arr[] = { 2,5,2,9,3,4,8,9,5 };
        for (int i=0; i<arr.length; i++) {
			int count = 0;

			for (int j=0; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
