/*
  Program: Count Even and Odd Elements in Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program counts the number of even and odd elements in an integer array.
*/

import java.util.Scanner;

public class P35_CountEvenOddInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int even = 0, odd = 0;

        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even elements: " + even);
        System.out.println("Odd elements: " + odd);

        scanner.close();
    }
}

/*
  Sample Output:
  Enter the number of elements in the array: 6
  Enter 6 array elements:
  2 7 9 4 8 3
  Even elements: 3
  Odd elements: 3
*/
