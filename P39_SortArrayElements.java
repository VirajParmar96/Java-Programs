/*
  Program: Sort Array Elements
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program sorts the elements of an array in ascending order.
*/

import java.util.Arrays;
import java.util.Scanner;

public class P39_SortArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sorted array in ascending order: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter number of elements in the array: 6
  Enter 6 array elements:
  42 17 23 8 99 1
  Sorted array in ascending order: 1 8 17 23 42 99
*/
