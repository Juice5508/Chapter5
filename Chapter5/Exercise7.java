package Chapter5;

import java.util.Random;
import java.util.Scanner;

public class Exercise7 {
	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			Random random = new Random();
	        int number = random.nextInt(100) + 1;
	        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
	        System.out.println("Type a number: ");
	        int guess = in.nextInt();
	        System.out.println("Your guess is: " + guess);
	        checkGuess(guess, number);
	        	
	        }
		public static void checkGuess(int guess, int number){
			if (guess > number){
	            System.out.println("You guessed too high");
	            Guess(number);
	        }
			else if (guess < number){
	        	System.out.println("You guessed too low");
	        	Guess(number);
	        }
	        else{
	        	System.out.println("The number I was thinking of is: " + number);
	        }
		}
		public static void Guess(int number){
			Scanner in = new Scanner(System.in);
			System.out.println("Type a number: ");
	        int guess = in.nextInt();
	        System.out.println("Your guess is: " + guess);
	        checkGuess(guess, number);
		}
	}


