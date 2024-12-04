import java.util.Scanner;

public class Main{

    private static int[][] getMinor(int[][] matrix, int row, int col) {
        int size = matrix.length;
        int[][] minor = new int[size - 1][size - 1];
        int minorRow = 0;

        for (int i = 0; i < size; i++) {
            if (i == row) continue;
            int minorCol = 0;
            for (int j = 0; j < size; j++) {
                if (j == col) continue;
                minor[minorRow][minorCol] = matrix[i][j];
                minorCol++;
            }
            minorRow++;
        }
        return minor;
    }

    private static void calcMin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір квадратної матриці (n): ");
        int size = scanner.nextInt();
        if (size <= 1) {
            System.out.println("Розмір матриці повинен бути більше 1.");
            return;
        }

        int[][] matrix = new int[size][size];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Введіть номер рядка для мінору (1-" + size + "): ");
        int row = scanner.nextInt() - 1; // Для індексації від 0
        System.out.print("Введіть номер стовпця для мінору (1-" + size + "): ");
        int col = scanner.nextInt() - 1;

        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Невірні індекси рядка або стовпця.");
            return;
        }

        int[][] minor = getMinor(matrix, row, col);
        
        System.out.println("Мінор матриці:");
        for (int[] r : minor) {
            for (int val : r) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        calcMin();
    }
}