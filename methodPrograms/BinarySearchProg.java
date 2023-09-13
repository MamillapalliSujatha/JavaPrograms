package com.methodPrograms;

public class BinarySearchProg {

	public static void main(String[] args) {
		int[] arr= {2,10,40,8,5,32};
		int val=40;
		BinarySearchProg ref=new BinarySearchProg();
		ref.Search(arr,val);
	}

	private void Search(int[] a,int n) {
		int temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
		}
		System.out.println("sorted array");
		for( int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=0;i<a.length;i++) {
			if(a[i]==n) {
				System.out.println("number "+ n +" is placed index:"+i);
			}
		
		}

	}

}

