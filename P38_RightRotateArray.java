/*
  Program: Right Rotate Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program performs a right rotation on a given integer array by one position.
*/

import java.util.Scanner;

public class P38_RightRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.print("Array after right rotation: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter number of elements in the array: 5
  Enter 5 array elements:
  1 2 3 4 5
  Array after right rotation: 5 1 2 3 4
*/
