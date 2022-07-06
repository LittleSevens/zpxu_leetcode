package com.zpxu.leetcode.chapter00;

/**
 * @author: zpxu
 * @date: 2022/6/2
 * @description:
 */
public class Solution0031 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        //从后往前，找到第一个nums[i]<nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);


    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
}
