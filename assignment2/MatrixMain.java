package assignment2;

import java.util.Arrays;
import java.util.Scanner;

class Matrix {
	private int rows;
	private int columns;
	private int[][] elements;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.elements = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < columns) {
			elements[i][j] = value;
		} else {
			System.out.println("Invalid position for setting element");
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.rows || this.columns != other.columns) {
			System.out.println("Matrices cannot be added");
			return null;
		}

		Matrix result = new Matrix(rows, columns);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
			}
		}
		return result;
	}

	public void display() {
		System.out.println("Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(elements[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class MatrixMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number of rows for matrix 1:");
		int rows1 = scanner.nextInt();

		System.out.println("Enter the number of columns for matrix 1:");
		int columns1 = scanner.nextInt();

		Matrix matrix1 = new Matrix(rows1, columns1);
		System.out.println("Enter the elements for matrix 1:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				System.out.print("Enter element at position (" + i + "," + j + "): ");
				int value = scanner.nextInt();
				matrix1.setElement(i, j, value);
			}
		}

		System.out.println("Enter the number of rows for matrix 2:");
		int rows2 = scanner.nextInt();

		System.out.println("Enter the number of columns for matrix 2:");
		int columns2 = scanner.nextInt();

		Matrix matrix2 = new Matrix(rows2, columns2);
		System.out.println("Enter the elements for matrix 2:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.print("Enter element at position (" + i + "," + j + "): ");
				int value = scanner.nextInt();
				matrix2.setElement(i, j, value);
			}
		}

		scanner.close();

		System.out.println("Matrix 1:");
		matrix1.display();

		System.out.println("Matrix 2:");
		matrix2.display();

		Matrix sum = matrix1.add(matrix2);
		if (sum != null) {
			System.out.println("Sum:");
			sum.display();
		}
	}
}