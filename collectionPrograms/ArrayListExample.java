package com.collectionPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ArrayListExample {
	public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grapes");
        
        ListIterator<String> listIterator = arrayList.listIterator();
        System.out.println("Iterating forward:");
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            String element = listIterator.next(); 
            System.out.println("Index: " + index + ", Element: " + element);

            if (element.equals("Banana")) {
                listIterator.set("Mango"); 
            }
        }
        while (listIterator.hasPrevious()) {
            int index = listIterator.previousIndex(); 
            String element = listIterator.previous();
            System.out.println("Index: " + index + ", Element: " + element);

            if (element.equals("Orange")) {
                listIterator.add("Peach"); 
            }
        }
        System.out.println("\nFinal ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
    }
}
