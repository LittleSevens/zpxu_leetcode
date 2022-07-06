package com.zpxu.leetcode.chapter01;

import com.zpxu.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/1
 * @description:
 */
public class Solution0095 {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1,n);
    }

    public List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> treeNodes = new ArrayList<>();
        if (start > end) {
            treeNodes.add(null);
            return treeNodes;
        }

        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTreeNodes = generateTrees(start, i - 1);

            List<TreeNode> rightTreeNodes = generateTrees(i + 1, end);

            for (TreeNode left : leftTreeNodes) {
                for (TreeNode right : rightTreeNodes) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    treeNodes.add(root);
                }
            }
        }
        return treeNodes;
    }

}
