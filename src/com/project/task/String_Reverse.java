package com.project.task;

import java.util.Scanner;

public class String_Reverse {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		char c[]=name.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
	}
		System.out.println("using char array");
		System.out.println(rev);
		
		
		StringBuffer bs=new StringBuffer(name);
		System.out.println("using String buffer");
		System.out.println(bs.reverse());
		
		
		
	}
}
