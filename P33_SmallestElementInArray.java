/*
  Program: Find Smallest Element in Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program finds the smallest element in a given integer array.
*/

import java.util.Scanner;

public class P33_SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest element in array = " + min);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 5
  Enter 5 array elements:
  23 9 15 87 42
  Smallest element in array = 9
*/
