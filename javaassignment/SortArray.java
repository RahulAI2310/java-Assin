package javaassignment;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	public static void sortHalfArray(int[] arr) {
		int length = arr.length;
		int mid = length / 2;

		Arrays.sort(arr, 0, mid);

		for (int i = mid, j = length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println("Original array: " + Arrays.toString(arr));
		sortHalfArray(arr);
		System.out.println(
				"Sorted array with first half in ascending and second half in descending: " + Arrays.toString(arr));

		scanner.close();
	}
}
