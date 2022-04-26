package com.project.task;

public class Reverse_number {
	public static void main(String[] args) {
		int n = 123;
		int temp = n;
		int rem = 0;

		int reverse = 0;
		while (temp > 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}
		System.out.println("reverse of a number is: " + reverse);

	}

}
