package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class matrixMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row of Matirx");
        int row1 = sc.nextInt();
        System.out.println("Enter the col of matrix");
        int col1 = sc.nextInt();
        int[][] matrix1 = getMatrix(row1, col1);
        System.out.println("Enter the row of Matirx");
        int row2 = sc.nextInt();
        System.out.println("Enter the col of matrix");
        int col2 = sc.nextInt();
        int[][] matrix2 = getMatrix(row2, col2);

        int[][] ans = new int[row1][col2];


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                int sum = 0;
                for (int k = 0; k < row1; k++)
                    sum += matrix1[i][k] * matrix2[k][j];
                ans[i][j] = sum;
            }
        }

        Arrays.deepToString(ans);

    }

    private static int[][] getMatrix(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();
        return matrix;
    }
}
