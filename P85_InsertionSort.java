/*
  Program: Insertion Sort
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Implements Insertion Sort algorithm to sort an array
    in ascending order.
*/

import java.util.Arrays;

public class P85_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
  Sample Output:
  Original Array: [64, 25, 12, 22, 11]
  Sorted Array: [11, 12, 22, 25, 64]
*/
