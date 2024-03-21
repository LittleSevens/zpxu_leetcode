package com.zpxu.leetcode.chapter00;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * 思路：该题的关键点是保存一个逆向的括号对的map
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0020 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty() || s.length() % 2 != 0) {
            return false;
        }
        Map<Character, Character> charMap = new HashMap<>();
        charMap.put(')', '(');
        charMap.put('}', '{');
        charMap.put(']', '[');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!charMap.containsKey(s.charAt(i))) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || charMap.get(c) != stack.peek()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
