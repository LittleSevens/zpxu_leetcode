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

    public boolean isSymmetric(TreeNode node1, TreeNode node2) {
        //两颗树都是空树，则肯定是对称的
        if (node1 == null && node2 == null) {
            return true;
        }
        //只要右一个为空则，肯定不对称
        if (node1 == null || node2 == null) {
            return false;
        }
        //若想对称，不仅值要相等左右子树也得是对称树
        return node1.val == node2.val
                && isSymmetric(node1.left, node2.right)
                && isSymmetric(node1.right, node2.left);
    }


}
