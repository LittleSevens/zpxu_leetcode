package com.zpxu.leetcode.chapter00;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/2
 * @description:
 */
public class Solution0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        while (cur != null) {
            n--;
            cur = cur.next;
        }
        if (n > 0) {
            return head;
        }

        if (n == 0) {
            return head.next;
        }

        cur = head;
        while (n != 0) {
            if (++n == 0) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
