/*
  Program: Reverse an Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program reverses the elements of a given integer array.
*/

import java.util.Scanner;

public class P36_ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Reversed array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 5
  Enter 5 array elements:
  1 2 3 4 5
  Reversed array: 5 4 3 2 1
*/
