package com.task.proj;

public class Public {
	public void method1() {
		System.out.println("public method");
	}
	public Public() {
		System.out.println("public constructor");
	}
	private void method2() {
		System.out.println("private method");
	}
	private Public(String s)
	{
		System.out.println("inside the private constructor: "+s);
	}
	protected Public(int n){
		System.out.println("protected constructor: "+n);
		
	}
	public static void main(String[] args) {
		Public p=new Public();
		p.method1();
		p.method2();
		Public p2=new Public("gayu");
		Public p3=new Public(123);
		
	}

}
