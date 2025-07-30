/*
  Program: Copy Elements to Another Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program copies all elements from one array to another.
*/

import java.util.Scanner;

public class P34_CopyArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] source = new int[n];
        int[] destination = new int[n];

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            source[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            destination[i] = source[i];
        }

        System.out.print("Copied array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(destination[i] + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 4
  Enter 4 array elements:
  5 10 15 20
  Copied array elements: 5 10 15 20
*/
