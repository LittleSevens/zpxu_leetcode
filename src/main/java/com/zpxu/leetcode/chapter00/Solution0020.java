package com.zpxu.leetcode.chapter00;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0020 {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>() {
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                if (stack.isEmpty()||!stack.peek().equals(map.get(c))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
