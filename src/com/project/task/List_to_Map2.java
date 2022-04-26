package com.project.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List_to_Map2 {
	public static void main(String[] args) {
		List<List_To_Map1>l=new ArrayList<List_To_Map1>();
		l.add(new List_To_Map1(1,"gayu"));
		l.add(new List_To_Map1(2,"gayathri"));
		l.add(new List_To_Map1(3,"shinchan"));
		Map<Integer,String>m=new HashMap<>();
		//method 1
		for(List_To_Map1 l1:l)
		{
			m.put(l1.getId(),l1.getName());
		}
		System.out.println(m);
		
		
		//method 2
		Map<Integer,String>m1=l.stream().collect(Collectors.toMap(List_To_Map1::getId,List_To_Map1::getName));
		System.out.println(m1);
		
		
		
	}

}
