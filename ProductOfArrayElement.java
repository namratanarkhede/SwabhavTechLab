package com.aurionpro.array.test;

import java.util.Scanner;

public class ProductOfArrayElement {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of elements in the array:");
    int n = sc.nextInt();
    int[] array = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        array[i] = sc.nextInt();
    }

    int[] prod = getProductArray(array);

    System.out.println("The product array is:");
    for (int p : prod) {
        System.out.print(p + " ");
    }

    sc.close();
}

public static int[] getProductArray(int[] array) {
    int n = array.length;
    int[] prod = new int[n];
    int[] left = new int[n];
    int[] right = new int[n];

    left[0] = 1;
    right[n - 1] = 1;

    for (int i = 1; i < n; i++) {
        left[i] = left[i - 1] * array[i - 1];
    }

    for (int i = n - 2; i >= 0; i--) {
        right[i] = right[i + 1] * array[i + 1];
    }

    for (int i = 0; i < n; i++) {
        prod[i] = left[i] * right[i];
    }

    return prod;
}
}