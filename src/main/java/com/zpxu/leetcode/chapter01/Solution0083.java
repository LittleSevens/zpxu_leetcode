package com.zpxu.leetcode.chapter01;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/19
 * @description:
 */
public class Solution0083 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy.next;
        while (cur != null) {
            if (cur.next != null && cur.next.val == cur.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
