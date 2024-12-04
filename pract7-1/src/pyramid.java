public class pyramid {
    public static void main(String[] args) {
        int[][] pyramid = new int[5][];
        for (int i = 0; i < pyramid.length; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = j + 1;
            }
        }

        System.out.println("Звичайний порядок:");
        for (int[] row : pyramid) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("Зворотній порядок:");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            for (int j = pyramid[i].length - 1; j >= 0; j--) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
