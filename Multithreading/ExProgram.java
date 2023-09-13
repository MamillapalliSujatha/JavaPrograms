package com.Multithreading;

public class ExProgram {

	public static void main(String[] args) {
		Thread t=new Thread("thread1");
		t.start();
		String str=t.getName();
		System.out.println(str);
	}

}
