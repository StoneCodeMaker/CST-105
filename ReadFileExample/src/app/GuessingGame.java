package app;

public class GuessingGame {

	public static void main(String[] args) {
		int secretNumber;
		secretNumber = (int) (Math.random() * 999 + 1);
		Scanner keyboard = new Scanner(Scanner.in);
		int guess;
		do {
			System.out.print("Enter a guess(1-10000): ");
			guess = keyboard.nextInt();
			if (guess == secretNumber) {}
			System.out.println("Your guess is correct Congratulations!");
			else if (guess <  secretNumber)
				System.out
							.println("Your guess is smaller than the secret number.");
			else if(guess > secretNumber)
				System.out
							.println("Your guess is greater than the secret.");
			
		} while(guess != secretNumber);

	}

}
