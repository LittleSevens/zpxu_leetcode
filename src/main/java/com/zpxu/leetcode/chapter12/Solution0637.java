package com.zpxu.leetcode.chapter12;

import com.zpxu.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/15
 * @description:
 */
public class Solution0637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            long sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.pollFirst();
                sum += node.val;
                if (node.left != null) {
                    deque.addLast(node.left);
                }
                if (node.right != null) {
                    deque.addLast(node.right);
                }
            }
            result.add(Double.valueOf(sum + "") / Double.valueOf(size + ""));
        }
        return result;
    }
}
