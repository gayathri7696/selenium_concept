package com.task.proj;

public class String_Fun {
public static void main(String[] args) {
	//retrieve alphabets and spl char in a string and concade them
	//method2
	String s="PGayathriSelvam@7696";
	String alpha="";
	String spl="";
	String digit="";
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		if(Character.isUpperCase(c[i])||Character.isLowerCase(c[i]))
		{
			alpha=alpha+c[i];
		}
		 else if(Character.isDigit(c[i]))
		{
			digit=digit+c[i];
		}
		 else
		 {
			 spl=spl+c[i];
		 }
	}
	System.out.println("alphabets in the string: "+alpha);
	System.out.println("spl character in the string: "+spl);
	System.out.println("concading alphabets and spl char: "+alpha+spl);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
