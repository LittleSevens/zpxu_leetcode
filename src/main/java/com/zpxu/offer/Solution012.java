package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution012 {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean flag = check(board, visited, i, j, word, 0);
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean check(char[][] board,
                         boolean[][] visited,
                         int i, int j,
                         String word, int k) {
        if (board[i][j] != word.charAt(k)) {
            return false;
        }
        if (k == word.length() - 1) {
            return true;
        }

        visited[i][j] = true;

        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        boolean result = false;
        for (int[] direct : directions) {
            int newI = i + direct[0];
            int newJ = j + direct[1];
            if (newI >= 0 && newI < board.length
                    && newJ >= 0 && newJ < board[0].length) {
                if (!visited[newI][newJ]) {
                    boolean flag = check(board, visited, newI, newJ, word, k + 1);
                    if (flag) {
                        result = true;
                        break;
                    }
                }
            }
        }

        visited[i][j] = false;

        return result;

    }

}
