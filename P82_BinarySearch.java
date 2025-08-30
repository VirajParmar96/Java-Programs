/*
  Program: Binary Search
  Level  : Intermediate
  Author : Viraj Parmar
  Description:
    Implements Binary Search on a sorted array
    to find the index of a given element.
*/

import java.util.Scanner;

public class P82_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0, high = arr.length - 1, mid, pos = -1;

        while (low <= high) {
            mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            System.out.println("Element found at index: " + pos);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}

/*
  Sample Output:
  Enter element to search: 30
  Element found at index: 2
*/
