package com.aurionpro.test;
import java.util.Scanner;

public class RideBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height : ");
		double height = sc.nextDouble();
		int charge = 0;
		
		if(height > 120) {
			System.out.println("Can ride");
			System.out.print("Enter the age : ");
			int age = sc.nextInt();
			if(age < 12) {
				charge += 5;
			}
			if(age >= 12 && age < 18) {
				charge += 7;
			}
			if(age >= 18 && age < 45) {
				charge += 12;
			}
			if(age >= 45 && age <= 55) {
				charge += 0;
			}
			System.out.println("Want photo ? (yes/no) :  ");
			
			String WantPhoto =  sc.nextLine().toLowerCase();
			if (WantPhoto.equals("yes")) {
				charge += 3;
				System.out.println("The total bill for ride is : " + charge + " $");
			}
			else {
				System.out.println("The total bill for ride is : " +charge + " +$");
			}
			
		}
		else {
			System.out.println("Can't ride");
		}
		sc.close();
	}

}
