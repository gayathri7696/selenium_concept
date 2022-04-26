package com.project.task;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repatitive_Letter {
	public static void main(String[] args) {
		String s="gayathri";
		char[]c=s.toCharArray();
		Map<Character,Integer>map=new LinkedHashMap<>();
		for(Character letter:c)
		{
			if(map.containsKey(letter))
			{
				Integer value=map.get(letter);
				map.put(letter, value+1);
			}
			else
			{
				map.put(letter, 1);
			}
		}
		System.out.println(map);
		Set<Entry<Character,Integer>>entryset=map.entrySet();
		for(Entry<Character,Integer>entry:entryset)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
	}

}
