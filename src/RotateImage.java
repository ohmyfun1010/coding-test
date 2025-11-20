package org.src;

public class RotateImage {

    public void rotate(int[][] matrix) {

        int n = matrix.length;

        int[][] copied = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                copied[row][col] = matrix[row][col];
            }
        }

        int destRow = 0;
        int destCol = 0;

        int srcRow = n - 1;
        int srcCol = 0;

        int filledInCurrentRow = 0;

        for (int filled = n * n - 1; filled >= 0; filled--) {
            if (filledInCurrentRow == n) {
                srcCol++;
                srcRow = n - 1;
                destRow++;
                destCol = 0;
                filledInCurrentRow = 0;
            }
            matrix[destRow][destCol] = copied[srcRow][srcCol];
            srcRow--;
            filledInCurrentRow++;
            destCol++;
        }

    }

    public static void main(String[] argc){

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImage ri = new RotateImage();
        ri.rotate(arr);

    }

}
