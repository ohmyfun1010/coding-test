package org.src;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0, c = 0, di = 0;

        for (int i = 0; i < rows * cols; i++) {
            result.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[di];
            int nc = c + dc[di];

            // 다음 칸이 범위 내에 있고, 아직 방문하지 않았다면 이동
            if (nr >= 0 && nr < rows && nc >= 0 && nc < cols && !visited[nr][nc]) {
                r = nr;
                c = nc;
            } else {
                // 벽에 부딪히거나 이미 방문한 곳이라면 방향 전환
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return result;

    }
    public static void main(String[] argc){
        SpiralMatrix main = new SpiralMatrix();
        System.out.println(main.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
