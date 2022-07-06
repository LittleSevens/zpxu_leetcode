package com.zpxu.leetcode.chapter11;

import com.zpxu.TreeNode;

import java.security.Signature;

/**
 * @author: zpxu
 * @date: 2022/6/15
 * @description:
 */
public class Solution0572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null || subRoot == null) {
            return false;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || dfs(root, subRoot);
    }

    public boolean dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return dfs(p.left, q.left) && dfs(p.right, q.right);
    }
}
