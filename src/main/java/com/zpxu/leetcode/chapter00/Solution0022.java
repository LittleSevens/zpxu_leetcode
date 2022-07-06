package com.zpxu.leetcode.chapter00;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/7/6
 * @description:数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */
public class Solution0022 {
    /**
     * 暴力递归
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        getAllCombination(new char[2 * n], 0, result);
        return result;
    }

    /**
     * 获取所有的组合
     *
     * @param combination
     * @param pos
     * @param result
     */
    public void getAllCombination(char[] combination, int pos, List<String> result) {
        //找到了最后一位
        if (pos == combination.length) {
            //且组合有效
            if (valid(combination)) {
                result.add(new String(combination));
            }
        } else {
            combination[pos] = '(';
            getAllCombination(combination, pos + 1, result);

            combination[pos] = ')';
            getAllCombination(combination, pos + 1, result);
        }
    }

    /**
     * 判断一个字符数组是否是有效饿括号
     *
     * @param chars
     * @return
     */
    public boolean valid(char[] chars) {
        int balance = 0;
        for (char s : chars) {
            if (s == '(') {
                balance++;
            } else {
                balance--;
            }
            //在当前位置如果balance<0说明右括号出现在了左括号的前面，可以提前结束
            if (balance < 0) {
                return false;
            }
        }
        return balance == 0;
    }

    /**
     * 回溯方法
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis1(int n) {
        List<String> result = new ArrayList<>();
        backtrack(new StringBuilder(), 0, 0, n, result);
        return result;
    }

    /**
     * 当左括号小于最大长度，则拼左括号；
     * 当右括号数量小于左括号数量则拼右括号
     *
     * @param combination
     * @param left        左括号的数量
     * @param right       右括号的数量
     * @param max         参数长度
     * @param result
     */
    public void backtrack(StringBuilder combination, int left, int right,
                          int max, List<String> result) {
        if (combination.length() == 2 * max) {
            result.add(combination.toString());
        }

        if (left < max) {
            combination.append('(');
            backtrack(combination, left + 1, right, max, result);
            combination.deleteCharAt(combination.length() - 1);
        }
        if (right < left) {
            combination.append(')');
            backtrack(combination, left, right + 1, max, result);
            combination.deleteCharAt(combination.length() - 1);
        }
    }


    public static void main(String[] args) {
        Solution0022 solution0022 = new Solution0022();
        List<String> result = solution0022.generateParenthesis1(1);
        System.out.println(result);
    }
}
