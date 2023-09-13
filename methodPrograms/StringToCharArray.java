package com.methodPrograms;

public class StringToCharArray {
	public static void main(String[] args) {
		StringToCharArray c=new StringToCharArray();
		String str="3.5";
		c.charMethod();
		c.floatMethod(str);
	}

	private void floatMethod(String str1) {
		float f=Float.parseFloat(str1); 
		System.out.println(f);
		
	}

	private void charMethod() {
		String s="hello";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]+" ");
		System.out.println();
	}

}
