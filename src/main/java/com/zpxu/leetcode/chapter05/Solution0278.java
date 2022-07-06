package com.zpxu.leetcode.chapter05;

/**
 * @author: zpxu
 * @date: 2022/6/7
 * @description:
 */
public class Solution0278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int n) {
        return true;
    }
}
