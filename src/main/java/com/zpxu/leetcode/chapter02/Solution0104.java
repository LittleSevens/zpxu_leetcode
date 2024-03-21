package com.zpxu.leetcode.chapter02;

import com.zpxu.TreeNode;

/**
 * 给定一个二叉树 root ，返回其最大深度。
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 *
 * @author: zpxu
 * @date: 2024/3/22
 * @description:
 */
public class Solution0104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }


}
