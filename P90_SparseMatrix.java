/*
  Program: Sparse Matrix Representation
  Level  : Advanced
  Author : Viraj Parmar
  Description:
    Converts a matrix into sparse matrix representation
    (only non-zero elements stored).
*/

import java.util.Scanner;

public class P90_SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int size = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] != 0)
                    size++;

        int[][] sparse = new int[size + 1][3];

        sparse[0][0] = rows;
        sparse[0][1] = cols;
        sparse[0][2] = size;

        int k = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] != 0) {
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = matrix[i][j];
                    k++;
                }
            }
        }

        System.out.println("Sparse Matrix Representation:");
        for (int i = 0; i < sparse.length; i++) {
            System.out.println(sparse[i][0] + " " + sparse[i][1] + " " + sparse[i][2]);
        }

        sc.close();
    }
}

/*
 Sample Input:
 3x3 Matrix:
 0 0 3
 0 0 5
 0 6 0

 Sample Output:
 Sparse Matrix Representation:
 3 3 3
 0 2 3
 1 2 5
 2 1 6
*/
