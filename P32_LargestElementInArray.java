/*
  Program: Find Largest Element in Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program finds the largest element in a given integer array.
*/

import java.util.Scanner;

public class P32_LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in array = " + max);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 6
  Enter 6 array elements:
  15 60 32 75 28 43
  Largest element in array = 75
*/
