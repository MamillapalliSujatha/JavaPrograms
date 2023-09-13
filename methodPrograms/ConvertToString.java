package com.methodPrograms;

public class ConvertToString {

	public static void main(String[] args) {
		ConvertToString cs=new ConvertToString();
		cs.toStrings();
	}

	private void toStrings() {
		float f=2.45f;
		String s=String.valueOf(f);
		if(s instanceof String)
			System.out.println("float is converted to string");
		else 
			System.out.println("float is not  converted to string");
		
		double d=5.46;
		String str=String.valueOf(d);
		if(str instanceof String)
			System.out.println("double is converted to string");
		else
			System.out.println("double is converted to string");
		
		short sh=3;
		String str1=String.valueOf(sh);
		if(str1 instanceof String) 
			System.out.println("short is converted to string");
		else
			System.out.println("short is not converted to string");
			
		
	}
}
