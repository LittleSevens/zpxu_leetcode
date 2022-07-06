package com.zpxu.other;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description: 给一个字符串，每遇到816的组合便删除，输出最后剩下的值。
 * 例如：8881616->8816->8;
 */
public class Solution01 {
    public static String getResult(String str) {
        if (str == null || str.length() < 3) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i);
            if (result.endsWith("816")) {
                result = result.substring(0, result.length()-3);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getResult("8881616"));
    }
}
