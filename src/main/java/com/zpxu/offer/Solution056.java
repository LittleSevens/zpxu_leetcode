package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution056 {
    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        int div = 1;
        while ((ret & div) == 0) {
            div <<= 1;
        }

        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & div) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
