package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNumber = random.nextInt(100-1)+1;
		System.out.println(randomNumber);
		int maxAttempt = 5;
		String playAgain = "yes";
		System.out.println("Welcome to Number guessing Game.");
		System.out.println("Guess the number by entering the One number at a time.");
        System.out.println("You have " +maxAttempt+ " lives to guess the word."  );
		
		while(playAgain.equals("yes")) {
			
			int attempts = 0;
			boolean hasWon = false;
			while(attempts < maxAttempt ) {
				System.out.println("Enter your guess : ");
				int guess = sc.nextInt();
				attempts++;
				if(guess > randomNumber) {
					System.out.println("Sorry to high");
				}
				else if(guess < randomNumber) {
					System.out.println("Sorry to low");
				}
				else {
					hasWon = true;
					System.out.println("You won! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
					break;
				}
			}
			if(hasWon!=true) {
				System.out.println("Game over! You've used all 5 attempts. The number was " + randomNumber + ".");
			}
			System.out.print("Do you want to play the game again? (yes/no): ");
	        playAgain = sc.next();
		}
		System.out.println("Thank you!");
        sc.close();
		
	}

}
