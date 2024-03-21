package com.zpxu.leetcode.chapter00;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 1
 * 给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 * @author: zpxu
 * @date: 2024/3/20
 * @description:
 */
public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numIndex.containsKey(target - nums[i])) {
                return new int[]{i, numIndex.get(target - nums[i])};
            }
            numIndex.put(nums[i], i);
        }
        return null;
    }
}
