package com.zpxu.offer;

/**
 * @author: zpxu
 * @date: 2022/6/6
 * @description:
 */
public class Solution033 {
    public boolean verifyPostorder(int[] postorder) {
        return check(postorder, 0, postorder.length - 1);
    }

    public boolean check(int[] postorder, int i, int j) {
        if (i >= j) {
            return true;
        }
        int index = i;
        while (postorder[index] < postorder[j]) {
            index++;
        }
        int mid = index;
        while (postorder[index] > postorder[j]) {
            index++;
        }
        return index == j && check(postorder, i, mid - 1) && check(postorder, mid, j - 1);
    }
}
