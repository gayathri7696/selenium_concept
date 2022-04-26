package com.project.task;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStatemen2 {
public static void main(String[] args) {
	PrintStream myoutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
	myoutput.print("hi gayathri\n");
}
}
