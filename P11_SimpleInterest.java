/*
  Program: Calculate Simple Interest
  Level  : Basic
  Author : Viraj Parmar
  Description:
    A program to calculate simple interest using the formula:
    SI = (P × R × T) / 100
*/

import java.util.Scanner;

public class P11_SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal Amount (P): ");
        float principal = scanner.nextFloat();

        System.out.print("Enter Rate of Interest (R): ");
        float rate = scanner.nextFloat();

        System.out.print("Enter Time in Years (T): ");
        float time = scanner.nextFloat();

        float simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
        scanner.close();
    }
}

/*
  Sample Output:
  Enter Principal Amount (P): 10000
  Enter Rate of Interest (R): 5
  Enter Time in Years (T): 2
  Simple Interest = 1000.0
*/
