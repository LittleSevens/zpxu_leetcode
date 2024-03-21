package com.zpxu.leetcode.chapter00;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Set<Character> set = new HashSet<>();
        int right = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (right < length && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            result = Math.max(result, right - i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution0003 a = new Solution0003();
        a.lengthOfLongestSubstring("pwwkew");
    }
}

