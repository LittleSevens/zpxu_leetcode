package com.zpxu.leetcode.chapter11;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/13
 * @description:
 */
public class Solution0563 {
    int result;

    public int findTilt(TreeNode root) {
        result = 0;
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);
        result += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}
