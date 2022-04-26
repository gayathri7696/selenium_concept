package com.project.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Synchronized {
	public static void main(String[] args) {
		List<Integer> s1=new LinkedList<Integer>();
		List<String>s2=new ArrayList<String>();
		Map <String,Integer> s3=new HashMap<String,Integer>();
		Map<String ,String> s4=new Hashtable<String,String>();
		StringBuilder builder=new StringBuilder("gayathri");
		StringBuffer buffer=new StringBuffer("gayu");
	
		synchronized (s1) {
			s1.add(10);
			s1.add(200);
			System.out.println(s1);
			}
		synchronized (s2) {
			s2.add("gayathri");
			s2.add("gayu");
			System.out.println(s2);
		}
		
		synchronized (s3) {
			s3.put("gayathri",25);
			s3.put("bhavani", 26);
			System.out.println(s3);
		}
		synchronized (s4) {
			s4.put("ram","pass"); 
			s4.put("ramesh", "pass");
			s4.put("suresh", "fail");
			s4.put("dinesh", "pass");
			System.out.println(s4);
		}
		synchronized (buffer) {
			System.out.println(buffer);	
		}
		synchronized (builder) {
			System.out.println(builder);
		}
	}

}
