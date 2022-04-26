package com.project.task;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Settolist {
public static void main(String[] args) {
	Set<String>set=new HashSet<>();
	set.add("kit kat");
	set.add("milky bar");
	set.add("galaxy");
	System.out.println("set is : "+set);
	List<String>list=new LinkedList<String>(set);
	System.out.println(list);
	
}
}
