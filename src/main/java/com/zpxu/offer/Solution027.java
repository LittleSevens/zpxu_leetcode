package com.zpxu.offer;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution027 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;

        return root;
    }
}
