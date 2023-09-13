package com.constructor;

public class Demo {
	int x=10;

	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo();
		d.x=d.x+10;
		d.method();
		d1.method();
	}

	void method() {
		System.out.println(x);
	}

}
