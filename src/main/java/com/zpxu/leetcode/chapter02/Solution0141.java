package com.zpxu.leetcode.chapter02;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/20
 * @description:
 */
public class Solution0141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
