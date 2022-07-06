package com.zpxu.leetcode.chapter01;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution0053 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length < 1) {
            return Integer.MIN_VALUE;
        }
        int maxResult = nums[0];
        int curResult = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curResult = Math.max(nums[i], curResult + nums[i]);
            maxResult = Math.max(curResult, maxResult);
        }
        return maxResult;
    }
}
