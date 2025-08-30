/*
  Program: Bubble Sort
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Implements Bubble Sort algorithm to sort an array
    in ascending order.
*/

import java.util.Arrays;

public class P83_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Original Array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
  Sample Output:
  Original Array: [64, 25, 12, 22, 11]
  Sorted Array: [11, 12, 22, 25, 64]
*/
