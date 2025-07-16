/*
  Program: Fibonacci Series
  Level  : Basic
  Description:
    This program prints the Fibonacci series up to a given number of terms.
    The Fibonacci sequence is: 0, 1, 1, 2, 3, 5, 8, ...
*/

import java.util.Scanner;

public class P08_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        scanner.close();
    }
}

/*
  Sample Output:
  Enter number of terms: 7
  Fibonacci Series: 0 1 1 2 3 5 8
*/
