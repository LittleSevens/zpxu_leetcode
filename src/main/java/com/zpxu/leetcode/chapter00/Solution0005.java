package com.zpxu.leetcode.chapter00;

/**
 * Leetcode005:最长回文字符串
 */
public class Solution0005 {

    public String longestPalindorme(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        for (int subLen = 2; subLen <= len; subLen++) {
            for (int i = 0; i < len; i++) {
                int j = subLen + i - 1;

                if (j >= subLen) {
                    break;
                }

                if (s.charAt(i) != s.charAt(j)) {
                    dp[i][j] = false;
                } else {
                    if (j - i <= 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if (dp[i][j] && subLen > maxLen) {
                    maxLen = subLen;
                    begin = i;
                }
            }

        }

        return s.substring(begin, begin + maxLen);
    }
}
