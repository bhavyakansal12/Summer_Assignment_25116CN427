package Day20;

import java.util.Scanner;

public class Q78_SymmetricMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        boolean isSymmetric = true;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is Not Symmetric");
        }

        sc.close();
    }
}