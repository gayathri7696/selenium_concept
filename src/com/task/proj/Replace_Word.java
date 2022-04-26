package com.task.proj;

public class Replace_Word {
	public static void main(String[] args) {
		//replace a word without using replace fun
		String s = "gayu is a good girl";
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].contains("gayu")) {
				s1[i] = "gayathri";
			}
			System.out.println(s1[i]);
		}
	}
}
