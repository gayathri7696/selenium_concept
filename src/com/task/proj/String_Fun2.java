package com.task.proj;

public class String_Fun2 {
public static void main(String[] args) {
	
	//retrieve alphabets and spl char in string and concade them
	//method 1
	
	String s="PGayathriSelvam@7696";
	String alpha = s.replaceAll("[^a-zA-Z]", "");
	String spl = s.replaceAll("[a-zA-Z0-9]", "");
	System.out.println("alphabets in the string: "+alpha);
	System.out.println("spl char in the string: "+spl);
	System.out.println("concading alphabets and spl character: "+alpha+spl);
	
	
	
	
	
	
	
	
	
	
}
}
