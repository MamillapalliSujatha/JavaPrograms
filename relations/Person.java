package com.relations;

public class Person {
	void show() {
		Address a=new Address("1-1-5","kbhp","hyd");
		Address b=new Address("1-4-5","b","vij");
		System.out.println("permanent address");
		a.peremanent(1,"tiru");
		a.display();
		System.out.println("temporary address");
		a.peremanent(1,"tiru");
		b.display();
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.show();
	}
}

class Address{
	String houseNo;
	String street;
	String location;
	
	 void peremanent(int empId,String empName){
			int id=empId;
			String name=empName;
			System.out.print(name+"("+id+")"+",");
	}
	 Address(String houseNo,String street, String location){
		this.houseNo=houseNo;
		this.street=street;
		this.location=location;
	 }
	 void display() {
		 System.out.println("HouseNo:" +this.houseNo +", street:" +this.street +", Location:" +this.location);
	 }

}

