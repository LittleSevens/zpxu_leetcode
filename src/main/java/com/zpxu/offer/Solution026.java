package com.zpxu.offer;

import com.zpxu.TreeNode;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution026 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null){
            return false;
        }
        return isSubStructure(A.left,B)||isSubStructure(A.right,B)||dfs(A,B);
    }

    public boolean dfs(TreeNode A, TreeNode B) {
        if (B==null){
            return true;
        }
        if (A==null||A.val!=B.val){
            return false;
        }
        return dfs(A.left, B.left)&&dfs(A.right,B.right);
    }
}
