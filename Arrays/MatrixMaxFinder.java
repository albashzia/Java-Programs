public class MatrixMaxFinder {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 5, 9},
            {1, 4, 7},
            {2, 6, 8}
        };

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("The maximum element in the matrix is: " + max);
    }
}
