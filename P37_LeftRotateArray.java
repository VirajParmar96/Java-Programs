/*
  Program: Left Rotate Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program performs a left rotation on a given integer array by one position.
*/

import java.util.Scanner;

public class P37_LeftRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;

        System.out.print("Array after left rotation: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 5
  Enter 5 array elements:
  10 20 30 40 50
  Array after left rotation: 20 30 40 50 10
*/
