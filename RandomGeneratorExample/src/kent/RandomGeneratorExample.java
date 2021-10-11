/*
 * Cameron Stickel
 * CST-105(1pm)
 * Random Generators
 * 10/08/2021
 * In Class Exercise 
 */



package kent;
// import Random Generator 
import java.util.Random;

public class RandomGeneratorExample {
	
	//Method to Create Random Numbers
	public static void main(String[] args) {
		{
		// Define Indentifiers 
		double randomNumber;
		int randomGenerator, min = 1, max = 200;
		
		//First Example
		randomNumber = Math.random() * (max - min) + min;
		System.out.printf("Random Sample 1; %f, randomNumber");
		System.out.printf("Random Sample 1; %f, randomNumber")
		
		
		//Second Example
		Random randomObj = new Random();
		randomGenerator = randomObj.nextInt(max - min)+min;
		System.out.format("/n/nRandom Sample 2: %d, random Generator")
		
	}

}
