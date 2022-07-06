package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution065 {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
