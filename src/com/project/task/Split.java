package com.project.task;

public class Split {
public static void main(String[] args) {
	String s="good day to all";
	String[]word=s.split("");
	
	int n=word.length;
	System.out.println(n);
	
	for(int i=0;i<n;i++)
	{
		System.out.println(word[i]);
	}
}
}

