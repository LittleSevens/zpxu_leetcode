package com.zpxu.offer;

import com.zpxu.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution007 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return myBuildTree(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    public TreeNode myBuildTree(int[] preorder, int preLeft, int preRight,
                                int[] inorder, int inLeft, int inRight) {
        if (preLeft > preRight) {
            return null;
        }
        int inRoot = map.get(preorder[preLeft]);

        int size = inRoot - inLeft;

        TreeNode root = new TreeNode(preorder[preLeft]);

        root.left = myBuildTree(preorder, preLeft + 1, preLeft + size,
                inorder, inLeft, inRoot - 1);

        root.right = myBuildTree(preorder, preLeft + size + 1, preRight,
                inorder, inRoot + 1, inRight);

        return root;
    }
}
