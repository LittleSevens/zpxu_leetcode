package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution063 {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            result = Math.max(result, prices[i] - min);
        }
        return result;
    }
}
