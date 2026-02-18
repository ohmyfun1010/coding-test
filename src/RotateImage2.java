package org.src;

public class RotateImage2 {

    public void rotate(int[][] matrix) {

        int size = matrix.length;
        int[][] tmpArr = new int[size][size];

        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                tmpArr[i][j] = matrix[i][j];
            }
        }

        int y = size-1;

        for(int i = 0;i<size;i++){
            for(int j = 0;j<size;j++){
                matrix[j][y] = tmpArr[i][j];
            }
            y--;
        }

    }

    public static void main(String[] argc){
        RotateImage2 main = new RotateImage2();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        main.rotate(arr);
    }

}
