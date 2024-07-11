package com.aurionpro.test;

import java.util.Scanner;

public class PrimePattern {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int number = sc.nextInt();

        int primeNumber = 2; 

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                while (true) {
                    boolean isPrime = true; 
                    int k = 2; 
                    while (k < primeNumber) { //2<3
                        if (primeNumber % k == 0) {
                            isPrime = false;
                            break;
                        }
                        k++;
                    }
                    if (isPrime) {
                        System.out.print(primeNumber + " ");
                        primeNumber++;
                        break;
                    } else {
                    	primeNumber++;
                    }
                }
            }
            System.out.println();
        }
    }

}
