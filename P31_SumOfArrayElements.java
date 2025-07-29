/*
  Program: Sum of Array Elements
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program calculates the sum of all elements in an integer array.
*/

import java.util.Scanner;

public class P31_SumOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of array elements = " + sum);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 5
  Enter 5 array elements:
  10 20 30 40 50
  Sum of array elements = 150
*/
