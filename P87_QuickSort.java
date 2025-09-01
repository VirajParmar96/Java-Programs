/*
  Program: Quick Sort
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Implements Quick Sort algorithm using recursion.
    It selects a pivot element and partitions the array.
*/

import java.util.Arrays;

public class P87_QuickSort {

    // Partition method
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = (low - 1); // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // QuickSort method
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Before pivot
            quickSort(arr, pi + 1, high); // After pivot
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
  Sample Output:
  Original Array: [10, 7, 8, 9, 1, 5]
  Sorted Array: [1, 5, 7, 8, 9, 10]
*/
