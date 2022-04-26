package com.project.task;

public class Cons1 {
private Cons1()
{
	System.out.println("iam a constructor");
}
public static void employee()
{
	System.out.println("iam a static method");
}
public void student()
{
	System.out.println("iam a non static method");
}
public static void main(String[]args)
{
	Cons1 obj=new Cons1();
employee();
obj.student();

	//try to extends this class in child class
}
}
