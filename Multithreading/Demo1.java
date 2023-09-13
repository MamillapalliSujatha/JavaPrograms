package com.Multithreading;

public class Demo1 {
	public static void main(String args[]) throws InterruptedException {
		Demo1 d=new Demo1();
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=new Thread();
		t1.start();
		t1.setName("theread 1");
		t1.join();
		t2.start();
		t2.setName("theread 2");
		t3.start();
		t3.setName("theread 3");
		
	}
	

}
