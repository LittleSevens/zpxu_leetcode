package com.zpxu.leetcode.chapter00;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0009 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNum = 0;
        while (reverseNum < x) {
            reverseNum = reverseNum * 10 + x % 10;
            x = x / 10;
        }
        return x == reverseNum || reverseNum / 10 == x;
    }
}
