package com.arrays.programs;

public class CompareArrays {

	public static void main(String[] args) {
		int[] arr1= {3,2,4,5};
		int[] arr2= {4,2,5,8};
		if(arr1==arr2) {
			System.out.println("arr1 and arr2 both are same");
			}
		else {
			System.out.println("arr1 and arr2 both are not same");
			}
	}	
}
/*
int[] arr1= {3,2,4,5};
int[] arr2= {4,2,5,8,7,5};
if(arr1.length==arr2.length) {
	System.out.println(" size of arr1 and arr2 both are same");
	}
else if(arr1.length>arr2.length) {
	System.out.println("arr1 size is grater than arr2 ");
	}
else {
	System.out.println("arr1 size is lesser than arr2 size");
}
}

}
*/
