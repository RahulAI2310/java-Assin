package javaassignment;

import java.util.Scanner;

public class Matrix {

	public static void rotateMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			int start = 0;
			int end = matrix[0].length - 1;	
			while (start < end) {
				int temp = matrix[i][start];
				matrix[i][start] = matrix[i][end];
				matrix[i][end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = scanner.nextInt();
		System.out.print("Enter number of columns: ");
		int columns = scanner.nextInt();

		int[][] matrix = new int[rows][columns];
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotateMatrix(matrix);

		System.out.println("Matrix after 90 degree clockwise rotation and reversal:");
		printMatrix(matrix);

		scanner.close();
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}
