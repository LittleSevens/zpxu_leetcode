package com.zpxu.leetcode.chapter11;

import com.zpxu.NTreeNode;

import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/15
 * @description:
 */
public class Solution0559 {
    public int maxDepth(NTreeNode root) {
        if (root == null) {
            return 0;
        }
        int maxDepth = 0;
        List<NTreeNode> children = root.children;
        for (NTreeNode child : children) {
            int depth = maxDepth(child);
            maxDepth = Math.max(depth, maxDepth);
        }

        return maxDepth + 1;
    }
}
