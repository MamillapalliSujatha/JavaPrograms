package com.relations;

public class Test {
	public static void main(String[] args) {
	/*	X x=new X();
		x.m1(x);
		x.m1(new Y());
	*/
		Y y=new Y();
		y.m1(null);
		
	/*	x=y;
		x.m1(null);
		x.m1(new X());
	*/
	}
}

class X {
	void m1(X x) {
		System.out.println("m1 method in class A");
	}
}

class Y extends X{
	void m1(X x) {
		System.out.println("m1 method in class B");
	}
}