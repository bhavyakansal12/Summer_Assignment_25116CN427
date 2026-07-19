package Day20;

import java.util.Scanner;

public class Q77_MatrixMultiplication {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows of A: ");
            int r1 = sc.nextInt();

            System.out.print("Enter columns of A: ");
            int c1 = sc.nextInt();

            System.out.print("Enter rows of B: ");
            int r2 = sc.nextInt();

            System.out.print("Enter columns of B: ");
            int c2 = sc.nextInt();

            if (c1 != r2) {
                System.out.println("Multiplication not possible");
                return;
            }

            int[][] A = new int[r1][c1];
            int[][] B = new int[r2][c2];
            int[][] C = new int[r1][c2];

            System.out.println("Enter elements of A:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of B:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("Result Matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}