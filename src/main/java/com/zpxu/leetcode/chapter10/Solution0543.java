package com.zpxu.leetcode.chapter10;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/13
 * @description:
 */
public class Solution0543 {
    int result = 1;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return result;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDept = depth(root.left);
        int rightDept = depth(root.right);
        result = Math.max(result, leftDept + rightDept + 1);
        return Math.max(leftDept, rightDept) + 1;

    }
}
