package com.zpxu.leetcode.chapter03;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0162 {
    public int findPeakElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            return nums[0];
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (compareTo(nums, mid, mid + 1) < 0
                    && compareTo(nums, mid - 1, mid) > 0) {
                return mid;
            }

            if (compareTo(nums, mid, mid + 1) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int compareTo(int[] nums, int left, int right) {
        if (left < 0) {
            return 1;
        }
        if (right > nums.length - 1) {
            return -1;
        }
        if (nums[left] == nums[right]) {
            return 0;
        }
        return nums[left] < nums[right] ? 1 : -1;
    }
}
