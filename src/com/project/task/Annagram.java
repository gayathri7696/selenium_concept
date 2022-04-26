package com.project.task;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Annagram {
	public static void main(String[] args) {
		
		String s1="listen";
		String s2="silent";
		s1=s1.replace(" ","" );
		s2=s2.replace(" ", "");
		if(s1.length()!=s2.length())
		{
			System.out.println("not annagram");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("c1 array: "+Arrays.toString(c1));
			System.out.println("c2 array: "+Arrays.toString(c2));
			if(Arrays.equals(c1, c2))
			{
				System.out.println("they are annagram");
			}
			else 
			{
				System.out.println("not annagram");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
