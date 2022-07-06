package com.zpxu.leetcode.chapter02;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val)
                || hasPathSum(root.right, targetSum - root.val);
    }
}
