package com.zpxu.leetcode.chapter00;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/6
 * @description:
 */
public class Solution0025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            ListNode tail = pre;

            for (int i = 0; i < k; i++) {
                tail = tail.next;
                if (tail == null) {
                    return dummy.next;
                }
            }

            ListNode first = pre.next;
            ListNode after = tail.next;


            pre.next = null;
            tail.next = null;

            reverse(first);
            pre.next = tail;
            first.next = after;

            pre = first;
            cur = after;

        }

        return dummy.next;
    }

    public void reverse(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
    }

}
