package com.zpxu.leetcode.chapter03;

import com.zpxu.ListNode;

/**
 * @author: zpxu
 * @date: 2022/6/20
 * @description:
 */
public class Solution0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lengthA = 0;
        int lengthB = 0;
        ListNode cur = headA;
        while (cur != null) {
            lengthA++;
            cur = cur.next;
        }

        cur = headB;
        while (cur != null) {
            lengthB++;
            cur = cur.next;
        }

        //head1表示比较长的链表
        ListNode head1 = lengthA > lengthB ? headA : headB;
        ListNode head2 = head1 == headA ? headB : headA;

        int k = Math.abs(lengthA - lengthB);
        while (k != 0) {
            head1 = head1.next;
            k--;
        }
        while (head1 != null) {
            if (head1 == head2) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return null;
    }
}
