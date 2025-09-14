/*
  Program: Quick Sort
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Implementing the Quick Sort algorithm using recursion.
    It sorts an array in ascending order by selecting a pivot
    and partitioning the elements.
*/

import java.util.Arrays;

public class PEnd_QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }
}

/*
  Sample Output:
  Original Array:
  [29, 10, 14, 37, 13]
  Sorted Array:
  [10, 13, 14, 29, 37]
*/
