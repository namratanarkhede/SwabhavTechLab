package com.aurionpro.test;

import java.util.Scanner;

public class WaterBillCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of units consumed : " );
		double NoOfUnitsConsumed = sc.nextDouble();
		
		double Meter_charge = 75;
		double charge = 0;
		
		if(NoOfUnitsConsumed <= 100) {
			charge = NoOfUnitsConsumed*5;
		}
		else if(NoOfUnitsConsumed <= 250){
			charge = NoOfUnitsConsumed*10;
		}
		else {
			charge = NoOfUnitsConsumed*20;
		}
		
		double Total_water_bill = charge + Meter_charge;
		System.out.println("The total water bill for consumed number of units is: " + Total_water_bill + " Rs");

		sc.close();
	}

}
