package com.relations;

public class HasARelation {
	A a=new A();
	public static void main(String[] args) {
		HasARelation h=new HasARelation();
		h.a.show();
	}
	
}

class A{
	void show() {
		System.out.println("class a");
	}
}
