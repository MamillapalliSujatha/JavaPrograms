package com.objectExample2;

public class Driver {

	public static void main(String[] args) {
		Driver d=new Driver();
		Product p=new Product();
		p.id=101;
		p.name="key board";
		p.price=500.00;
		d.print(p);
	}

	private void print(Product p) {
		System.out.println(p.id+"---"+p.name+"--- "+p.price);
	}

}
