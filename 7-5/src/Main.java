import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Розмір матриці (N x N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        int[][] transposed = new int[n][n];

        System.out.println("Оригінальна матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(10);
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        System.out.println("Транспонована матриця:");
        for (int[] row : transposed) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}