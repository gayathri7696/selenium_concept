package com.project.task;

public class Ex_demo {
	public static void main(String[] args) {

		try {
			int a = 10;
			System.out.println(a / 0);
		} catch (NullPointerException e) {
			System.out.println("handle null pointer");
		}

		catch (Exception e) {
			System.out.println("handle arithmetic exception");

			String s=null;
			System.out.println(s.toLowerCase());
			System.out.println("execution sucess");
		}

	}

}
