package com.project.task;

public class Armstrong_number {
	public static void main(String[] args) {
		
	
	int n=153;
	int temp=n;
	int rem=0;
	int arm=0;
	while(temp>0)
	{
		rem=temp%10;
		arm=arm+rem*rem*rem;
		temp=temp/10;
		
	}
	if(arm==n)
	{
		System.out.println("it is armstrong");
	}
	else
	{
		System.out.println("it is not armstrong");
	}

}
}