package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		Account a=new Account();
		a.setAccNum(85238);
		a.setName("sujatha");
		
		int accNum=a.getAccNum();
		String name=a.getName();
		System.out.println(accNum+" "+name);
	}

}
