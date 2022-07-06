package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution013 {

    public int movingCount(int m, int n, int k) {
        int result = 0;
        boolean[][] visted = new boolean[m][n];
        visted[0][0] = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i == 0) || !check(i, j, k)) {
                    continue;
                }
                if (i >= 1) {
                    visted[i][j] |= visted[i - 1][j];
                }
                if (j >= 1) {
                    visted[i][j] |= visted[i][j - 1];
                }

                result += visted[i][j] ? 1 : 0;
            }
        }

        return result;
    }

    public boolean check(int m, int n, int k) {
        int result = 0;
        while (m != 0) {
            result += m % 10;
            m /= 10;
        }

        while (n != 0) {
            result += n % 10;
            n /= 10;
        }

        return result <= k ? true : false;
    }

    public static void main(String[] args) {
        Solution013 a = new Solution013();
        a.movingCount(38, 15, 9);
    }
}
