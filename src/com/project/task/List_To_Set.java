package com.project.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List_To_Set {
	public static void main(String[] args) {
		List<String>l=new ArrayList<String>();
		l.add("gayu");
		l.add("gayathri");
		l.add("bhavani");
		System.out.println("list is: "+l);
		Set<String>s=new TreeSet<String>(l);
		System.out.println("set is: "+s);
		
	}

}
