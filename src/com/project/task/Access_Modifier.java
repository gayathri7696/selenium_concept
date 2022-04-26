package com.project.task;

public class Access_Modifier {
	
		
	public void method1() {
		System.out.println("public method");
	}	
	private void method2() {
		System.out.println("private method");
	}	
	protected void method3() {
	System.out.println("protected method");
		}
		public static void main(String[] args) {
			Access_Modifier a1=new Access_Modifier();
			a1.method1();
			a1.method2();
			a1.method3();
		}
		
		
		
		
		
	

}
