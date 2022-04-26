package com.task.proj;

public class Replace_Char {
	public static void main(String[] args) {
		
		//replace a char without using replace method
		String s="gayi";
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='i')
			{
				c[i]='u';
			}
			System.out.print(c[i]);
		}
		
		
	}

}
