package com.zpxu.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution061 {
    public boolean isStraight(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = 14;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            min = Math.min(num, min);
            max = Math.max(num, max);
            if (!set.contains(num)) {
                return false;
            }
            set.add(num);
        }
        return max - min < 5;
    }
}
