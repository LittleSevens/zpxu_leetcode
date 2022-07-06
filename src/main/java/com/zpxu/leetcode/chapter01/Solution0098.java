package com.zpxu.leetcode.chapter01;

import com.zpxu.TreeNode;

import java.util.Stack;

/**
 * @author: zpxu
 * @date: 2022/6/2
 * @description:
 */
public class Solution0098 {
    public boolean isValidBST(TreeNode root) {
        return check(root);
    }

    public boolean check(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        Long value = Long.MIN_VALUE;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (root.val < value) {
                return false;
            }
            value = (long) root.val;
            root = root.right;
        }
        return true;
    }
}
