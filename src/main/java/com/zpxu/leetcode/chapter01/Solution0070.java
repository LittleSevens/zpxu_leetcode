package com.zpxu.leetcode.chapter01;

import java.io.FileReader;

/**
 * @author: zpxu
 * @date: 2022/7/5
 * @description:
 */
public class Solution0070 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int num1 = 1;
        int num2 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
