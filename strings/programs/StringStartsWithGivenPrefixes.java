package com.strings.programs;

public class StringStartsWithGivenPrefixes {

	public static void main(String[] args) {
		String[] arr= {"greek","for","geek"};
		String s="geek for greeks";
		boolean result=false;
		for(int i=0; i<3;i++) {
            if (s.startsWith(arr[i])) {
                result = true;
                break;
            }
        }
        if(result)
            System.out.println("Given String starts with one of the prefixes.");
        else
            System.out.println("Given String do not starts with one of the prefixes.");
	}

}
