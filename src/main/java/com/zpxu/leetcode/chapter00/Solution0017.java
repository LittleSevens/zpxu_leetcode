package com.zpxu.leetcode.chapter00;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: zpxu
 * @date: 2022/6/30
 * @description:
 */
public class Solution0017 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) {
            return result;
        }
        Map<Character, String> phoneLetter = new HashMap<>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };

        backTrack(result, digits, 0, new StringBuilder(), phoneLetter);

        return result;

    }

    public void backTrack(List<String> result, String digits, int index,
                          StringBuilder combination,
                          Map<Character, String> phoneLetter) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }

        Character num = digits.charAt(index);
        String letters = phoneLetter.get(num);
        for (int i = 0; i < letters.length(); i++) {
            combination.append(letters.charAt(i));
            backTrack(result, digits, index + 1, combination, phoneLetter);
            combination.deleteCharAt(combination.length()-1);
        }
    }
}
