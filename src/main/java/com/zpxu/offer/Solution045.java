package com.zpxu.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution045 {
    public String minNumber(int[] nums) {
        int length = nums.length;
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            strings[i] = nums[i] + "";
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (Long.valueOf(o1 + o2)).compareTo(Long.valueOf(o2 + o1));
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution045 a = new Solution045();
        a.minNumber(new int[]{3, 30, 34, 5, 9});
    }
}
