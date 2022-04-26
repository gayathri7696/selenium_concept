package com.project.task;

public final class Variable1 {
	
	 int age;
	 static int n=1;
	public  void sslc()
	{
		 
		  System.out.println(age ); 
	}
	public void hsc()
	{
		 age=1000;
		System.out.println(age );
	}
public void clg()
{
	System.out.println(age);
}
public static void name()
{
	System.out.println("gayu");
}
public static void main(String[] args) {
	Variable1 obj=new Variable1();
	obj.sslc();
	obj.hsc();
obj.clg();
}
}
