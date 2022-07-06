package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution047 {
    public int maxValue(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j];
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
                }
            }
        }
        return dp[rows - 1][columns - 1];
    }

    public static void main(String[] args) {
        Solution047 ac= new Solution047();
        ac.maxValue(new int[][]{{1,3,1},{1,5,1},{4,2,1}});
    }
}
