package Part_3_Advance;

// Matrix Multiplication
import java.util.Scanner;

public class Problem2_MatrixMultiplication {

    static void checker(int cols1, int rows2) {
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns for the first matrix: ");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number of rows and columns for the second matrix: ");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        checker(cols1, rows2);

        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        int[][] result = new int[rows1][cols2];

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

