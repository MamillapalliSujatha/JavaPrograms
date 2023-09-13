package com.constructor;

public class Main {

	private String name;

	public static void main(String[] args) {
		Main m=new Main();
		System.out.println("name is "+m.name);

	}

	protected Main() {
		System.out.println("Constructor is called");
		name="sujatha";
		System.out.println("Constructor is called");
	}

}
