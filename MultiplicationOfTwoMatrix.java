package com.aurionpro.multidimensionArray;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of the first matrix: ");
        int rows1 = sc.nextInt(); //2
        System.out.println("Enter the number of columns of the first matrix: ");
        int cols1 = sc.nextInt(); //2

        System.out.println("Enter the elements of the first matrix:");
        int[][] matrix1 = readMatrix(sc, rows1, cols1);

        System.out.println("Enter the number of rows of the second matrix: ");
        int rows2 = sc.nextInt(); //2
        System.out.println("Enter the number of columns of the second matrix: ");
        int cols2 = sc.nextInt(); //2
        if (cols1 != rows2) { //2!=2
            System.out.println("Matrix multiplication is not possible. Number of columns in the first matrix must equal the number of rows in the second matrix.");
            return;
        }

        System.out.println("Enter the elements of the second matrix:");
        int[][] matrix2 = readMatrix(sc, rows2, cols2);

        
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2, rows1, cols1, cols2);

         System.out.println("The resultant matrix after multiplication is:");
         printMatrix(resultMatrix, rows1, cols2);
        
    }
	//	[1 2] * [1 2] = [1*1+2*1  1*2+2*2] = [3 6]
	//	[1 2] * [1 2] = [1*1+2*1  1*2+2*2] = [3 6]

	 public static int[][] readMatrix(Scanner sc, int rows, int cols) {
	        int[][] matrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	                System.out.println(matrix[i][j]  + " ");
	            }

	            System.out.println();
	        }
	        return matrix;
	    }
	 	//			cols1    cols2
	 	//	         0 1	 0 1
		//rows 1	[1 2] * [1 2] = [1*1+2*3  1*2+2*4] = [7 10]
		//rows 1	[3 4] * [3 4] = [3*1+4*3  3*2+4*4] = [15 22]

	    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int cols1, int cols2) {
	        int[][] result = new int[rows1][cols2];
	        for (int i = 0; i < rows1; i++) { //i=0
	            for (int j = 0; j < cols2; j++) { //j=0
	                for (int k = 0; k < cols1; k++) { //k=0
	                	int a = matrix1[i][k];
	                	int b =  matrix2[k][j];
	                    result[i][j] += matrix1[i][k] * matrix2[k][j]; //[[0,0] = [0][0] *[0][0] = []]
	                }
	            }
	        }
	        return result;
	    }

	    public static void printMatrix(int[][] matrix, int rows, int cols) {
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
