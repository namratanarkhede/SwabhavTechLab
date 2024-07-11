package com.aurionpro.test;

import java.util.Scanner;

public class CurrencyDenomitionApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		
		int amount = sc.nextInt();
		
		if(amount > 50000 && amount % 100 != 0 ) {
			System.out.println("Enter valid amount which should be multiple of 100 and less than or equal to 50000");
		}

		int count2000 = amount/2000;
		amount %=  2000;
		
		int count500 = amount/500;
		amount %= 500;
		
		int count200 = amount/200;
		amount %= 200;
		
		int count100 = amount/100;
		amount %= 100;
		
		if(count2000 > 0) {
			System.out.println("Two Thousand : " +count2000);
		}
		else if(count500 > 0) {
			System.out.println("Five Hundred : " +count500);
		}
		else if(count200 > 0) {
			System.out.println("Two Hundred : " +count200);
		}
		else if(count100 > 0) {
			System.out.println("One Hundred : " +count100);
		}
		
		sc.close();
		
		
	}

}
