/*
  Program: Print Pyramid Pattern
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints a pyramid pattern using asterisks (*) for a fixed number of rows.
*/

public class P23_PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Print stars
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
*/
