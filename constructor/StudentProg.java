package com.constructor;

public class StudentProg {

	int id;
	String name; 
	public static void main(String[] args) {
		StudentProg sp=new StudentProg(1,"sujatha");
		sp.display();
	}
	private void display() {
		System.out.println(id+"--"+name);	
	}
	StudentProg(int i,String n){
		id=i;
		name=n;
	}

}
