package com.polymorphism;

public class sbiBank extends rbiBank {
	double getHomeLoan() {
		return 12.85;
	}
	public String applyHomeLoan() {
		boolean status = checkElgibility();
		if(status) {
			double homeLoan=getHomeLoan();
			String msg="your loan approved with in RI";
			return msg;
		}
		else {
			return "you are not elgible for home loan";
		}
	}
	public static void main(String args[]) {
		sbiBank bank=new sbiBank();
		String msg=bank.applyHomeLoan();
		System.out.println(msg);
	}
}
