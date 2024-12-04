import java.util.Random;

public class ReplaceOddIndices {
    public static void main(String[] args) {
        Random rand = new Random();
        int rows = 4, cols = 4;
        double[][] array = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextDouble() * 10;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
            }
        }

        for (double[] row : array) {
            for (double num : row) {
                System.out.printf("%.2f ", num);
            }
            System.out.println();
        }
    }
}