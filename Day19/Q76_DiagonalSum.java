package Day19;

import java.util.Scanner;

public class Q76_DiagonalSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int sum = 0;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    sum += matrix[i][j];
                }

                if (i + j == n - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Diagonal Sum = " + sum);

        sc.close();
    }
}