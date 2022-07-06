package com.zpxu.leetcode.chapter08;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/13
 * @description:
 */
public class Solution0404 {
    public int sumOfLeftLeaves(TreeNode root) {
        return dfs(root);
    }

    public int dfs(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }
        if (root.left != null) {
            result += isLeaf(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null && !isLeaf(root.right)) {
            result += dfs(root.right);
        }
        return result;
    }

    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
