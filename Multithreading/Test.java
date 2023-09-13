package com.Multithreading;

public class Test implements Runnable {

	public static void main(String[] args) {
		Test t1=new Test();
		Thread t=new Thread(t1);
		//t.start();
	}
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t);
		//System.out.println(currentThread);
		System.out.println("run method");
	}

}
