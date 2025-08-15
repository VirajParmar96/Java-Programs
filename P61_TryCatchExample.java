/*
  Program: Try-Catch Example
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program demonstrates the use of try-catch blocks to handle exceptions.
*/

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } 
        finally {
            sc.close();
            System.out.println("Scanner closed.");
        }
    }
}

/*
  Sample Output 1:
  Enter numerator: 10
  Enter denominator: 2
  Result: 5
  Scanner closed.

  Sample Output 2:
  Enter numerator: 10
  Enter denominator: 0
  Error: Division by zero is not allowed.
  Scanner closed.
*/
