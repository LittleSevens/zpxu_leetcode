package com.zpxu.leetcode.chapter04;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/21
 * @description:
 */
public class Solution0203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }

        }
        return dummy.next;
    }
}
