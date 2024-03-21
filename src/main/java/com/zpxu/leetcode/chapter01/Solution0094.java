package com.zpxu.leetcode.chapter01;

import com.zpxu.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * 递归写法，主要关键点都是新起一个方法；在该题中注意把需要返回的结果当作一个参数传入的思想
 * 非递归写法，需要注意循环终止条件的确定，这个在今日还是把握不好，需要多加练习
 * @author: zpxu
 * @date: 2022/6/1
 * @description:
 */
public class Solution0094 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inner(root, result);
        return result;
    }

    public void inner(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inner(root.left, result);
        result.add(root.val);
        inner(root.right, result);
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
