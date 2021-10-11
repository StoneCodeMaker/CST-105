/*
 * Cameron Stickel
 * CST-105(1pm)
 * Read File Example
 * 10/08/2021
 * In Class Example
 */

package app;
// import the file class 

import java.io.File;
//import the class to handle errors
import java.io.FileNotFoundException;
// import the scanner class to read the txt file 
import java.util.Scanner; 

public class ReadFileExample 
{

	public static void main(String[] args)
	{
		// Define Identifier 
		String data = null;
		
		// try catch if there is an error make sure we catch it...)
	
		try
		{
		// Create an instance of the text file 
		File myObj = new File();
		// Now tell the scanner to read from the file 
		Scanner myReader = new Scanner(myObj);
		// Loop through the txt file
		while(myReader.hasNextLine())
		{
			// Read the line from the file just like we did in the console
			data = myReader.nextLine();
			System.out.printf("%s", data);
			
		}
		// Always close the reader 
		myReader.close("/Users/ekigf/Dropbox/Mac/Documents/CST-105/CST-105 participation .txt");
		
		}
		catch(FileNotFoundException e) // exception raided when there is an error reading/finding file 
		
		{
		System.out.println("An error occurred");
		// The error is stored in = (printStackTrace() is a method)
		// printStackTrace will pinpoint the exact line in which the exception was raised 
		}
	}
		
	
}
