package org.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.LinkedList;

public class NumberofIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int cnt = 0;

        // 상하좌우 방향을 미리 정의 (코드 중복 제거)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // 땅이고 아직 방문하지 않은 경우만 새로운 섬으로 인정
                if (grid[i][j] == '1' && !visited[i][j]) {
                    cnt++;

                    // 1. Map 대신 int[]를 사용하여 메모리 아끼기
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i, j});
                    visited[i][j] = true; // 2. 큐에 넣는 즉시 방문 처리 (중복 방지 핵심)

                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int x = curr[0];
                        int y = curr[1];

                        // 3. 4방향 탐색을 반복문으로 깔끔하게 처리
                        for (int d = 0; d < 4; d++) {
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            // 경계값 체크 및 땅/방문여부 확인
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                                if (grid[nx][ny] == '1' && !visited[nx][ny]) {
                                    visited[nx][ny] = true; // 방문 도장 먼저 찍기
                                    queue.add(new int[]{nx, ny});
                                }
                            }
                        }
                    }
                }
            }
        }
        return cnt;
    }

    public static void main(String[] argc){
        NumberofIslands main = new NumberofIslands();
//        char[][] arr = {
//            {'1', '1', '0', '0', '0'},
//            {'1', '1', '0', '0', '0'},
//            {'0', '0', '1', '0', '0'},
//            {'0', '0', '0', '1', '1'}
//        };
        char[][] arr = {
                {'1'},
                {'1'}
        };
        System.out.println(main.numIslands(arr));
    }

}
