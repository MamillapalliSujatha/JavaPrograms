package com.payment;

public class BillCollector {
	Payment p=new CreditCard();
	public void payBill(double amount) {
		String result=p.pay();
		System.out.println(result);
	}
	Payment p1=new DebitCard();
	public void payBill1(double amount) {
		String result=p.pay();
		System.out.println(result);
	}
}
