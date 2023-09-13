package com.Multithreading;

public class Demo extends Thread{

	public static void main(String[] args) throws InterruptedException {
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
	}
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run method");
	}

}
