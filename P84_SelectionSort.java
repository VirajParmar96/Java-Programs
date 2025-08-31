/*
  Program: Selection Sort
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Implements Selection Sort algorithm to sort an array
    in ascending order.
*/

import java.util.Arrays;

public class P84_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
  Sample Output:
  Original Array: [64, 25, 12, 22, 11]
  Sorted Array: [11, 12, 22, 25, 64]
*/
