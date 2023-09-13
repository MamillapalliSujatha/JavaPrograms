package com.constructor;

public class Overloading {

	int id;
	String name;
	int age;
	public static void main(String[] args) {
		Overloading o=new Overloading(1,"suji");
		Overloading o1=new Overloading(2,"lucky",25);
		o.display();
		o1.display();
	}
	private void display() {
		System.out.println(id+"  "+name+"  "+age);
		
	}
	Overloading(int i,String n){
		id=i;
		name=n;
	}
	Overloading(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}

}
