package com.zpxu.leetcode.chapter00;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        int fast = 0;
        for (; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
