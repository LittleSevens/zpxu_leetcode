package com.zpxu.leetcode.chapter01;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 最简单的动态规划，f(n)=f(n-1)+f(n-2)
 * @author: zpxu
 * @date: 2022/7/5
 * @description:
 */
public class Solution0070 {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int first = 1;
        int second = 2;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
