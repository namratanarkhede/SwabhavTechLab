package com.aurionpro.test;

import java.util.Scanner;

public class PrimePattern2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int number = sc.nextInt();
        
        int primeCandidate = 2; 
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                while (true) {
                    boolean isPrime = true;
                    if (primeCandidate <= 1) {
                        isPrime = false;
                    }
                    for (int k = 2; k <= Math.sqrt(primeCandidate); k++) {
                        if (primeCandidate % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.print(primeCandidate + " ");
                        primeCandidate++;
                        break;
                    } else {
                        primeCandidate++;
                    }
                }
            }
            System.out.println();
        }
    }
}
