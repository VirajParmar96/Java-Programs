/*
  Program: Check Leap Year
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program checks whether a given year is a leap year.
    A year is a leap year if it is divisible by 4 but not by 100,
    except when it is also divisible by 400.
*/

import java.util.Scanner;

public class P12_LeapYearCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeap = true;
            }
        }

        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}

/*
  Sample Output:
  Enter a year: 2024
  2024 is a Leap Year.

  OR

  Enter a year: 2023
  2023 is not a Leap Year.
*/
