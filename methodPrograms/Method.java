package com.methodPrograms;

import java.util.Arrays;

public class Method {

	public static void main(String[] args) {
		Method m=new Method();
		int arr[]= {1,2,3,4};
		m.fullName("sujatha","mamillapalli");
		m.print(arr);

	}

	private void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	private void fullName(String string, String string2) {
		String name=string+string2;
		System.out.println(name);
	}
	

}
