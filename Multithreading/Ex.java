package com.Multithreading;

public class Ex extends Thread{
	 public void run(){
		    System.out.println("hello");
	 }
	 public static void main(String args[]){
		  Ex m=new Ex();
		  Thread t=new Thread(m);
		  t.start();
	 }
}
