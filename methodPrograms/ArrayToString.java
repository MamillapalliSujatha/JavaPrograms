package com.methodPrograms;

public class ArrayToString {

	public static void main(String[] args) {
		ArrayToString as=new ArrayToString();
		as.Arrays();
	}

	private void Arrays() {
		String[] strList= {"hello","how","are","you"};
		StringBuilder str=new StringBuilder("");
		for(String eachOne:strList) {
			str.append(eachOne).append(",");
		}
		String list = str.toString();
		
		//condition for remove last comma
		if(list.length() > 0)
        
        list=list.substring(0,list.length() - 1);

        // Printing the comma separated string
        System.out.println(list);
		
	}

}
