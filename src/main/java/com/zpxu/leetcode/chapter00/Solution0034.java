package com.zpxu.leetcode.chapter00;

/**
 * @author: zpxu
 * @date: 2022/6/1
 * @description:
 */
public class Solution0034 {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[]{left, right};
    }

    public int binarySearch(int[] nums, int target, boolean leftFlag) {
        if (nums.length < 1) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (leftFlag) {
                if (nums[mid] == target) {
                    right = mid - 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] == target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        if (leftFlag) {
            return left < nums.length && nums[left] == target ? left : -1;
        } else {
            return right >= 0 && nums[right] == target ? right : -1;
        }
    }
}
