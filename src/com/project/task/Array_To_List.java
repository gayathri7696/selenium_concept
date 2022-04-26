package com.project.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Array_To_List {
	public static void main(String[] args) {
		//method 1
		/*String colour[]= {"red","blue","orange"};
		List<String> l1=Arrays.asList(colour);
		System.out.println(l1);
		//method 2
		String fruits[]= {"apple","orange","grapes"};
		List<String>l2=new ArrayList<String>();
		Collections.addAll(l2, fruits);
		System.out.println(l2);
		//method 3
		String[] choco= {"kit kat","milky bar","galaxy"};
		List<String>l3=new ArrayList<>();
		for(String s:choco)
		{
			l3.add(s);
		}
		System.out.println(l3);*/
		
		int []d= {10,20,30,40};
		System.out.println("array :");
		for(int j=0;j<d.length;j++)
		{
			System.out.print(d[j]+" ");
		}
		List <Integer>l=new LinkedList<Integer>();
		for(int i:d)
		{
			l.add(i);
		}
		System.out.println('\n'+"list: "+l);
	}
}
