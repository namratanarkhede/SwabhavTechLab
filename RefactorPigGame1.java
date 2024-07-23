package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class RefactorPigGame1 {
	private int totalScore;
	private Scanner scanner;
	private Random random;
	
	public RefactorPigGame1() {
		totalScore = 0;
		scanner = new Scanner(System.in);
		random = new Random();
	}
	public void start() {
		System.out.println("Welcome to PIG Game");
		int turn =1;
		while(totalScore < 20) {
			playTurn(turn);
			turn++;
		}
		endGame(turn);
	}
	
	private void playTurn(int turn) {

		System.out.println("TURN : " +turn);
		int turnScore = 0;
		boolean turnOver = false;
		while(!turnOver) {
			String choice = getChoice();
			
			if(choice.equals("roll")) {
				int dieValue = rollDie();
				turnScore = processRoll(dieValue, turnScore);
				turnOver = isTurnOver(dieValue);
			}
			if(choice.equals("hold")) {
				totalScore += turnScore;
				turnOver = true;
			}
			
		}
		displayTurnResults(turnScore);
	}
	private void displayTurnResults(int turnScore) {
		System.out.println("Score for turn: " + turnScore);
        System.out.println("Total score: " + totalScore + "\n");
	}
	private boolean isTurnOver(int dieValue) {
		return dieValue==1;
	}
	private int processRoll(int dieValue, int turnScore) {
		if(dieValue==1) {
			System.out.println("Turn Over. No Score");
			return 0;
		}
		return turnScore+=dieValue;
	}
	private int rollDie() {
		int dieValue = random.nextInt(6)+1;
		System.out.println("Die: "+dieValue);
		return dieValue;
	}
	private String getChoice() {
		System.out.println("Roll or Hold? : ");
		String input = scanner.next();
		return input.toLowerCase();
	}
	private void endGame(int turn) {
		  System.out.println("You finished in " + (turn - 1) + " turns!\n");
	      System.out.println("Game Over!");
	      scanner.close();
		
	}
	public static void main(String[] args) {
		RefactorPigGame1 refactorPigGame1 = new RefactorPigGame1();
		refactorPigGame1.start();
	}
	
}
