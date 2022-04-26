package com.project.task;

public class Int_To_String {
	public static void main(String[] args) {
		int i=200;
		//String s=String.valueOf(i);
		//System.out.println(s+100);
		//System.out.println(i+100);
		
		/*String s=Integer.toString(i);
		System.out.println(s+100);
		System.out.println(i+100);
		*/
		
		int i3=500;
		String s=String.format("%d",i3);
		System.out.println(s);
	}

}
