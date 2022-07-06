package com.zpxu.leetcode.chapter08;


import com.zpxu.Node;

/**
 * @author: zpxu
 * @date: 2022/6/1
 * @description: 0430:https://leetcode.cn/problems/flatten-a-multilevel-doubly-linked-list
 */
public class Solution0430 {
    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    public Node dfs(Node head) {
        Node cur = head;
        Node last = null;

        while (cur != null) {
            Node next = cur.next;
            if (cur.child != null) {
                Node childLast = dfs(cur.child);

                cur.next = cur.child;
                cur.child.prev = cur;
                cur.child = null;

                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }

                last = childLast;
            } else {
                last = cur;

            }
            cur = next;
        }
        return last;
    }
}
