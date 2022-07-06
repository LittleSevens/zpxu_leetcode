package com.zpxu.leetcode.chapter05;

import com.zpxu.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/10
 * @description:
 */
public class Solution0257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        getPath(root, "", result);
        return result;
    }

    public void getPath(TreeNode root, String path, List<String> result) {
        if (root != null) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(root.val);
            if (root.left == null && root.right == null) {
                result.add(sb.toString());
            } else {
                sb.append("->");
                getPath(root.left, sb.toString(), result);
                getPath(root.right, sb.toString(), result);
            }
        }
    }
}
