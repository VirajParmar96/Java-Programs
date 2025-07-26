/*
  Program: Print Floyd’s Triangle
  Level  : Basic
  Author : Viraj Parmar
  Description:
    This program prints Floyd’s Triangle with a fixed number of rows.
    Floyd’s Triangle is a right-angled triangular array of natural numbers.
*/

public class P25_FloydsTriangle {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

/*
  Sample Output:
  1
  2 3
  4 5 6
  7 8 9 10
  11 12 13 14 15
*/
