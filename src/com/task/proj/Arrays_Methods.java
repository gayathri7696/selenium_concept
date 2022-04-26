package com.task.proj;

import java.util.Arrays;
import java.util.List;

public class Arrays_Methods {
	public static void main(String[] args) {
	
		int d[]= {12,50,90,55,10};
		int key=12;
		Arrays.sort(d);
		int binarySearch = Arrays.binarySearch(d, key);
		System.out.println(key +" is at the index "+binarySearch);
		
		
		String colour[]= {"red","blue","orange"};
		List<String> asList = Arrays.asList(colour);
		System.out.println("array to list: "+asList);
    
		 int a[] = { 10, 20, 15, 22, 35 };
		 
	        
	        System.out.println("Integer Array: "
	                           + Arrays.toString(a));
        
	        String[] stringArray = { "a", "b", "c", "d", "e" };
	        boolean b = Arrays.asList(stringArray).contains("a");
	        System.out.println(b);
    
		
		
}

}
