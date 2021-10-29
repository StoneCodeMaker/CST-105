/*
 * Cameron Stickel
 * CST-105
 * 
 */

import java.util.Scanner; 

public class GuessingGame {

	 public static void guessingNumberGame()
	 {
	        // Scanner Class
	        Scanner sc = new Scanner(System.in);
	 
	        // Generate the numbers
	        int number = 1 + (int)(100 * Math.random());
	 
	        // Given K trials
	        int K = 5;
	 
	        int i, guess;
	 
	        System.out.println(
	            "A number is chosen"
	            + " between 1 to 100."
	            + "Guess the number"
	            + " within 5 trials.");
	 
	        // Iterate over K Trials
	        for (i = 0; i < K; i++) {
	 
	            System.out.println(
	                "Guess the number:");
	 
	            // Take input for guessing
	            guess = sc.nextInt();
	 
	            // If the number is guessed
	            if (number == guess) {
	                System.out.println(
	                    "Congratulations!"
	                    + " You guessed the number.");
	                break;
	            }
	            else if (number > guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is "
	                    + "greater than " + guess);
	            }
	            else if (number < guess
	                     && i != K - 1) {
	                System.out.println(
	                    "The number is"
	                    + " less than " + guess);
	            }
	        }
	 
	        if (i == K) {
	            System.out.println(
	                "You have exhausted"
	                + " K trials.");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	}
	 
	public static void main(String[] args) {
		
<<<<<<< Updated upstream
		 guessingNumberGame();
		
		/*
		int secretNumber;
		secretNumber = (int) (Math.random() * 999 + 1);
		//Scanner keyboard = new Scanner(Scanner.in);
		Scanner keyboard = new Scanner(System.in); 
		int guess;
=======
		int randomNumber;
		randomNumber = (int) (Math.random() * 999 + 1);

		Scanner scanner = new Scanner(System.in); 
		
		int userGuess;
>>>>>>> Stashed changes
		do {
			
			System.out.print("Please enter a value between 1 and 10000:");
			userGuess = scanner.nextInt();
			if (userGuess == randomNumber) {
				System.out.println("WINNER");
			}
		
			else if (userGuess < randomNumber)
			{
				System.out.println("HIGHER");
			}
				
			else if(userGuess > randomNumber)
			{
				System.out.println("LOWER");
			}
			
			
		} while(userGuess != randomNumber);
		
<<<<<<< Updated upstream
		keyboard.close();
		*/
		
		
=======
		scanner.close();
>>>>>>> Stashed changes
	}

}




