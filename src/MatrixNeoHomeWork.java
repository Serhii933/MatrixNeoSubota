public class MatrixNeoHomeWork {
    public static void main(String[] args) {
            int[][] matrix = new int[8][8];
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == 0) {
                        matrix[i][j] = j + 1;
                    } else {
                        matrix[i][j] = 8 - j;
                    }
                }
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


