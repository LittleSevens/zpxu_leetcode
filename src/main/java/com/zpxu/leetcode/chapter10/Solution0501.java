package com.zpxu.leetcode.chapter10;

import com.zpxu.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/13
 * @description:
 */
public class Solution0501 {
    int base;
    int count;
    int maxCount;
    List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] reslut = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            reslut[i] = list.get(i);
        }
        return reslut;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        update(root.val);
        dfs(root.right);
    }

    public void update(int value) {
        if (value == base) {
            count++;
        } else {
            base = value;
            count = 1;
        }

        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(value);
        } else if (count == maxCount) {
            list.add(value);
        }
    }
}
