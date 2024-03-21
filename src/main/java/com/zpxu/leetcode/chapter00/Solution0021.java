package com.zpxu.leetcode.chapter00;

import com.zpxu.ListNode;

/**
 * leetcode 21
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 关键点：1、用一个虚拟头指针 2、一个迭代指针
 * @author: zpxu
 * @date: 2022/6/20
 * @description:
 */
public class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                pre.next = list1;
                list1 = list1.next;
            } else {
                pre.next = list2;
                list2 = list2.next;
            }
            pre = pre.next;
        }
        pre.next = list1 == null ? list2 : list1;
        return dummy.next;
    }
}
