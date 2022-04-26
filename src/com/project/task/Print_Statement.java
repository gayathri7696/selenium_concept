package com.project.task;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Print_Statement {
	public static void main(String[] args) throws IOException {
		
		System.out.write("gayathri\n".getBytes());
		
		System.out.format("%s","hi gayu\n");
		
		PrintStream myoutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myoutput.print("hi gayathri\n");
		
		System.err.print("gayu gayu\n");
		
		//System.console().writer().println("hai");

}
}


