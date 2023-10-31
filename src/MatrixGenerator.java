import java.util.Random;

public class MatrixGenerator {
    public static int[][] generateTrainingMatrix() {
        int[][] matrix = new int[8][8];
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = random.nextInt(8) + 1;
                } else {
                    matrix[i][j] = random.nextInt(8) + 1;
                }
            }
        }

        return matrix;
    }
}

