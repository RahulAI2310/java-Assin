/* Q.6 Create an integer array of size n and read the elements from the user .Add an exception handling block 
to print the value at nth position of the array */

import java.util.*;
public class ArrayValuePos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the size of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];


            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the position to get the value: ");
            int position = sc.nextInt();
            int value = getValueAtPosition(arr, position);
            System.out.println("Value at position " + position + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position. Please enter a valid position within the array bounds.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }

    public static int getValueAtPosition(int[] arr, int position) {
        return arr[position - 1];
    }
}