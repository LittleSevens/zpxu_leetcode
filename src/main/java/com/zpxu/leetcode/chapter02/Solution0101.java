package com.zpxu.leetcode.chapter02;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/7
 * @description:
 */
public class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public boolean isSymmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val
                && isSymmetric(root1.left, root2.right)
                && isSymmetric(root1.right, root2.left);
    }
}
