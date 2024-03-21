package com.zpxu.leetcode.chapter03;

import com.zpxu.ListNode;

/**
 * leetcode 160
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 * 解题思路：两个链表加起来的长度是一样的，所以把两个链表串起来是个很巧妙的技巧
 *
 * @author: zpxu
 * @date: 2022/6/20
 * @description:
 */
public class Solution0160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode newAHead = headA;
        ListNode newBHead = headB;
        while (newAHead != newBHead) {
            // 需要注意这里的细节，否则很容易出错
            newAHead = newAHead == null ? headA : newAHead.next;
            newBHead = newBHead == null ? headB : newBHead.next;
        }
        return newAHead;
    }
}
