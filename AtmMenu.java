package com.aurionpro.test;

import java.util.Scanner;

public class AtmMenu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = 1000;
		boolean ATMRunning = true;
		while(ATMRunning) {
			System.out.println("ATM MENU");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.println("Please choose an option: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Your current Balance is: " +balance);
				break;
			case 2:
				System.out.println("Enter the amount to deposit: ");
				double depositAmount = sc.nextDouble();
				if(depositAmount > 0) {
					balance += depositAmount;
					System.out.println("You have deposited " + depositAmount+ " Your new balance is " +balance);
				}
				else {
					System.out.println("Invalid amount.Deposit amount must be greater than zero.");
				}
				break;
			case 3:
				System.out.println("Enter the amount to withdraw: ");
				double withdrawAmount = sc.nextDouble();
				if(withdrawAmount > 0 && withdrawAmount<=balance) {
					balance -= withdrawAmount;
					System.out.println("You have withdrawn " + withdrawAmount+ " Your new balance is " +balance);
				}
				else if(withdrawAmount > balance) {
					 System.out.println("Insufficient balance. Withdraw amount exceeds current balance.");
				}
				else {
					 System.out.println("Invalid amount. Withdraw amount must be greater than zero.");
				}
				break;
			case 4:
				System.out.println("Thank you for using ATM Menu");
				ATMRunning=false;
				break;
			default:
				System.out.println("Invalid input. Please select correct option.");
				break;
			}
		}
	}

}
