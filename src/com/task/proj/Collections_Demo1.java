package com.task.proj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Demo1 {
	public static void main(String[] args) {
		 List<String> items = new ArrayList<>();
		 
	       
	        items.add("Shoes");
	        items.add("Toys");
	        items.add("Horse");
	        items.add("Ball");
	        items.add("Grapes");
	        Collections.sort(items);
	        System.out.println(
	            "The index of Horse is "
	            + Collections.binarySearch(items, "Horse"));
	        System.out.println(
	            "The index of Dog is "
	            + Collections.binarySearch(items, "Dog"));
	    }
	
	
}
