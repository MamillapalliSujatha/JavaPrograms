package com.conditional.statements;

public class RoleFinder {
	public static void main(String args[]) {
		int exp = 23;

		if( exp >= 0 && exp <= 2 ){
			System.out.println("Associate Engineer");
		}
		else if ( exp >= 3 && exp <=5 ){
			System.out.println("Software Engineer");
		}
		else if(  exp >= 6 && exp <=9 ){
			System.out.println("Sr. Software Engineer");
		}
		else if( exp >= 10 && exp <=13 ){
			System.out.println("Manager");
		}
		else{
			System.out.println("Role Not Found");
		}
	}

}
