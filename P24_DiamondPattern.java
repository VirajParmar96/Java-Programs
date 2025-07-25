/*
  Program: Print Diamond Pattern
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints a diamond-shaped pattern using asterisks (*) for a fixed number of rows.
*/

public class P24_DiamondPattern {
    public static void main(String[] args) {
        int rows = 5;

        // Top half
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
  Sample Output:
      *
     ***
    *****
   *******
  *********
   *******
    *****
     ***
      *
*/
