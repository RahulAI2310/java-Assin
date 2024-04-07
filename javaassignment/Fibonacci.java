package javaassignment;

import java.util.Scanner;

public class Fibonacci {
	static int fibonacci(int i) {
		if (i <= 1)
			return i;
		return fibonacci(i - 1) + fibonacci(i - 2);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the position of Fibonacci number: ");
		int position = scanner.nextInt();

		int fibonacciNumber = fibonacci(position);
		System.out.println("Fibonacci number at position " + position + " is: " + fibonacciNumber);

		scanner.close();
	}
}