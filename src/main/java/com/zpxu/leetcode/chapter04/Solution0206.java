package com.zpxu.leetcode.chapter04;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/21
 * @description:
 */
public class Solution0206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
