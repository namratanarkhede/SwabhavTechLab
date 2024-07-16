package com.aurionpro.array.test;

import java.util.Scanner;

public class SquareOfSortedArrayCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the Sorted array element");
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Array is: ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i] + "\t") ;
		}

		System.out.println("\n ");
		System.out.println("Sorted Square element is :");
		int[] result = new int[size];
		int left = 0;           // 1 2 3 => 0 1 2 //left[0] = 1
		int right = size-1;     //size = 3 // right = 3-1=2 //right[2] = 3
		
		
		for(int i = size-1 ; i>=0; i-- ) { //2;2>=0 => true
			int leftSquare = array[left]*array[left];  // 
			int rightSquare = array[right]*array[right];
			if(leftSquare>rightSquare) {
				result[i] =leftSquare;
				left++;
			}
			else {
				result[i] = rightSquare;
				right--;
			}
		}
		for(int i = 0; i<size; i++) {
			System.out.print(result[i] +"\t");
		}
	}

}
