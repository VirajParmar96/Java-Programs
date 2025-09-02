/*
  Program: Transpose of a Matrix
  Level  : Beginner
  Author : Viraj Parmar
  Description:
    Reads a matrix and prints its transpose.
*/

import java.util.Scanner;

public class P89_TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        // Transpose logic
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
 Sample Input:
 Enter rows: 2
 Enter columns: 3
 Matrix: [[1,2,3],[4,5,6]]

 Sample Output:
 Transpose of Matrix:
 1 4
 2 5
 3 6
*/
