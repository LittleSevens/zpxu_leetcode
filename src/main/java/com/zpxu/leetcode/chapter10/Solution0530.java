package com.zpxu.leetcode.chapter10;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/13
 * @description:
 */
public class Solution0530 {
    int pre;
    int result;

    public int getMinimumDifference(TreeNode root) {
        pre = -1;
        result = Integer.MAX_VALUE;
        dfs(root);
        return result;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);

        if (pre==-1){
            pre = root.val;
        }else {
            result = Math.min(result, root.val - pre);
            pre = root.val;
        }

        dfs(root.right);

    }
}
