package com.collectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
	    List<Object> arrayList = new ArrayList<>();
        arrayList.add("Sujatha");
        arrayList.add(20);
        arrayList.add("jamal");
        arrayList.add("Chandini");
        arrayList.add(22);
        
        ListIterator<Object> listIterator = arrayList.listIterator();
        System.out.println("Iterating forward:");
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            Object element = listIterator.next(); 
            System.out.println("Index: " + index + "  Element: " + element);

            if (element.equals("Jamal")) {
                listIterator.set("Akhila"); 
            }
        }
        System.out.println("Iterating Backward:");
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex(); 
            Object element = listIterator.previous();
            System.out.println("Index: " + index + "  Element: " + element);

            if (element.equals("Sujatha")) {
                listIterator.add(25); 
            }
        }
        System.out.println("\nFinal ArrayList:");
        for (Object Names : arrayList) {
            System.out.println(Names);
        }
	}

}
