package com.project.task;

public class Variable2   {
	public static void show()
	{
		Variable1.name();//calling static method from parent class using parent class as obj
		
		
		
		
	}
	public static void main(String[] args) {
		Variable1 obj=new Variable1();
		obj.clg();
		show();
		obj.hsc();
		
	}
}
