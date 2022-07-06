package com.zpxu.leetcode.chapter04;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
