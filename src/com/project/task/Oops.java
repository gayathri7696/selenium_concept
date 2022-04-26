package com.project.task;

//why java 100% not obj oriented prog lang?
public class Oops {
	static String name = "gayu";// static variable

	private static void demo()// static method
	{
		System.out.println("hi gayu");
	}

	public static void main(String[] args) {
		demo();// static method is called without using obj
		System.out.println(name);// static method is called without using obj

		int i = 10;
		byte b = 20;
		short s = 30;
		long l = 100l;
		double d = 25.54d;
		float f = 100f;
		boolean flag = true;
		char c = 'r'; // the 8 primitive datatypes are called without using obj
		System.out.println(i);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		System.out.println(flag);
		System.out.println(c);
		
		


	}
}

// in this...in main method we cal the static variable (name) without creating obj
//and static method is called in main method without creating obj.....
//the 8 primitive datatypes are called without using obj.......so java is not 100%obj oriented prog lang
