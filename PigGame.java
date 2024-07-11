package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class PigGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int totalScore = 0;
		int turn =1;
		System.out.println("Welcome to PIG game.");
		while(totalScore<20) {
			System.out.println("TURN : " + turn);
			int turnScore = 0;
			boolean turnOver = false;
			while(!turnOver) {
				System.out.println("Roll or Hold? (r/h) : ");
				String choice = sc.next();
				if(choice.equals("r")) {
					int die = random.nextInt(6)+1;
					System.out.println("Die : " + die);
					if(die == 1) {
						turnScore = 0;
						turnOver = true;
						System.out.println("Turn Over. No Score");
					}
					else {
						turnScore += die;
					}
				}else if(choice.equals("h")){
					totalScore += turnScore;
					turnOver = true;
					System.out.println("Score for turn : " +turnScore);
					System.out.println("Total score: " + totalScore + "\n");
					
				}else {
					System.out.println("Invalid Input");
				}
			}
			turn++;
		}
		System.out.println("You finised in " +(turn-1)+"turns! \n");
		System.out.println("Game Over!");
		sc.close();
	}

}
