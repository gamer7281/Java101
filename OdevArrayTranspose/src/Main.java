import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("Matris : ");
        for (int[] col: matrix) {
            for (int row: col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int[] col: transposedMatrix) {
            for (int row: col) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] transposedMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}
