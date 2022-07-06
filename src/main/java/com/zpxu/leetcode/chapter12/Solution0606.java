package com.zpxu.leetcode.chapter12;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/15
 * @description:
 */
public class Solution0606 {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }
        if (root.left == null && root.right == null) {
            return root.val + "";
        }
        if (root.right == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(root.val)
                    .append("(")
                    .append(tree2str(root.left))
                    .append(")");
            return sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val)
                .append("(")
                .append(tree2str(root.left)).append(")(")
                .append(tree2str(root.right)).append(")");
        return sb.toString();
    }
}
