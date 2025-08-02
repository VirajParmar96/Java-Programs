/*
  Program: Remove Duplicate Elements from Array
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program removes duplicate elements from an integer array.
    Only unique elements are retained in the output using a Set.
*/

import java.util.*;

public class P40_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Use LinkedHashSet to maintain insertion order
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for (int value : arr) {
            uniqueSet.add(value);
        }

        System.out.print("Array after removing duplicates: ");
        for (int value : uniqueSet) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}

/*
  Sample Output:
  Enter number of elements in the array: 8
  Enter 8 array elements:
  1 2 2 3 4 4 5 5
  Array after removing duplicates: 1 2 3 4 5
*/
