package com.zpxu.leetcode.chapter04;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}
