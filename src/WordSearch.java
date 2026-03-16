package org.src;

public class WordSearch {

    private static final int[] dx = {-1, 1, 0, 0};
    private static final int[] dy = {0, 0, -1, 1};

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        for (int dir = 0; dir < 4; dir++) {
            int nextI = i + dx[dir];
            int nextJ = j + dy[dir];

            // 다음 칸으로 이동해서 하나라도 true가 나오면 즉시 true 반환
            if (dfs(board, word, nextI, nextJ, index + 1)) {
                return true;
            }
        }

        board[i][j] = temp;

        return false;
    }

    public static void main(String[] argc){

    }

}
