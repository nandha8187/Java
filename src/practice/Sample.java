package practice;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// System.out.write(Byte [] arg0) method java.io.filteroutputstream.write(byte[] b) method

		System.out.write("NANDHA KUMAR".getBytes());

		// System.out.format("format",object obj) by using this method we can format the text and print

		System.out.format("%s","NANDHA KUMAR");

		// create PrintStream object by passing FileOutputstream(FileDescriptor.out) object as an arg

		PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("NANDHA KUMAR");


		// System.err.print("") method to print the message actually its used to print error message
		System.err.print("NANDHA KUMAR");







	}

}
