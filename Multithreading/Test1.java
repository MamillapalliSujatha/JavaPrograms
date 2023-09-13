package com.Multithreading;

public class Test1 implements Runnable {

	public void run() {
		
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Test1 t= new Test1();
		Thread t1= new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t1.setName("s1");
	//	t1.join();
		t2.start();
		t2.setName("s2");
		t2.join();
		t3.start();
		t3.setName("s3");
		System.out.println("main");
	}

}


