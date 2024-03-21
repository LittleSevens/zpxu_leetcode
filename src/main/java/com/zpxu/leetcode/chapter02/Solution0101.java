package com.zpxu.leetcode.chapter02;


import com.zpxu.TreeNode;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 * 主要思路是需要写出递归函数，这个递归函数的含义是如何判断两棵树是对称的
 * 1、根结点值相等
 * 2、每个树的左子树都与另一棵树的右子树镜像对称
 *
 * @author: zpxu
 * @date: 2022/6/7
 * @description:判断一棵树是否为堆成的二叉树
 */
public class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        return inner(root, root);
    }

    public boolean inner(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && inner(node1.left, node2.right) && inner(node1.right, node2.left);
    }


}
