package org.src;

public class CountServersthatCommunicate {

    public int countServers(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] rowCount = new int[m];
        int[] colCount = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // 같은 행 또는 열에 다른 서버가 있음
                    if (rowCount[i] > 1 || colCount[j] > 1) {
                        result++;
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] argc){
        CountServersthatCommunicate main = new CountServersthatCommunicate();
        main.countServers(new int[][]{{1,0},{1,1}});
    }

}
