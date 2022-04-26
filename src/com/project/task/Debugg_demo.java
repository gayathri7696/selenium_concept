package com.project.task;

public class Debugg_demo {
	public static void add()
	{
		System.out.println("hello");
		System.out.println("good day");
	}
public static void main(String[] args) {
	int a=10;
	for(int i=0;i<5;i++)
	{
		System.out.println(i);
		System.out.println(a);
	}
	System.out.println("hi");
	System.out.println("gayu");
	add();
	System.out.println("closeSteps out of the current method and takes you to the caller method.");
	
}
}
