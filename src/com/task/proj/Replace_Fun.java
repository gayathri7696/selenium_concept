package com.task.proj;

public class Replace_Fun {
	public static void main(String[] args) {
		
		//replace upper case,lower case and spl char
		String s="PGayathr7696@gmail.com";
		String remove_upper = s.replaceAll("[A-Z]", "");
		String lower_case = s.replaceAll("[a-z]", "");
		String spl = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println("replacing all upper case: "+remove_upper);
		System.out.println("Replacing all lower case: "+lower_case);
		System.out.println("replacing all spl character: "+spl);
		
		
		
		
		
		
		
		
		
		
	}

}
