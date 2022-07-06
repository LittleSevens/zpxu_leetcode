package com.zpxu.leetcode.chapter02;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
