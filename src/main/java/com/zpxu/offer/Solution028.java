package com.zpxu.offer;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution028 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        }

        return a.val == b.val && check(a.left, b.right) && check(a.right, b.left);
    }
}
