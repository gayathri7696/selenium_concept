package com.task.proj;

public class Reverse_Words {
	public static void main(String[] args) {
		//reverse the sentence
		String s="Steven jane smith";
		String s1[]=s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i];
			rev=rev+" ";
		}
		
		System.out.println(rev);
		
		
		
		
		
		
		
		
	
}

}
