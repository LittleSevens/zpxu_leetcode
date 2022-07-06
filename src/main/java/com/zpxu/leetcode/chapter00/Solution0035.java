package com.zpxu.leetcode.chapter00;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 1) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
