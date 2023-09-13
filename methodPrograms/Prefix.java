package com.methodPrograms;

public class Prefix {

	public static void main(String[] args) {
		String[] arr= {"greek","for","geek"};
		String s="geek for greeks";
		boolean r=Prefix.method(arr,s);
		if(r)
            System.out.println("Given String starts with one of the prefixes.");
        else
            System.out.println("Given String do not starts with one of the prefixes.");
		
	}

	private static boolean method(String[] a,String str) {
		boolean result=false;
		for(int i=0;i<a.length;i++) {
            if (str.startsWith(a[i])) {
                result = true;
                break;
            }
        }
		return result;
	}

}
