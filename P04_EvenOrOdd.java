/*
  Program: Check Even or Odd
  Level  : Basic
  Description:
    This program checks whether a given integer is even or odd.
*/

import java.util.Scanner;

public class P04_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
        scanner.close();
    }
}

/*
  Sample Output:
  Enter an integer: 7
  7 is Odd.

  OR

  Enter an integer: 12
  12 is Even.
*/
