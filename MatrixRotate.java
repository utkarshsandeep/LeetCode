public class MatrixRotate {
//    11 12 13
//    21 22 23
//    31 32 33
//
//    31 21 11
//    32 22 12
//    33 23 13
    public static void main(String[] args) {
        MatrixRotate ob = new MatrixRotate();
        ob.soln(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }

    public void soln(int[][] matrix) {
        int m1[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                m1[i][j] = matrix[matrix.length - 1 - j][i];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = m1[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
