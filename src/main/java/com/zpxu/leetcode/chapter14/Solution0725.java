package com.zpxu.leetcode.chapter14;

import com.zpxu.ListNode;

import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/5
 * @description:
 */
public class Solution0725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }

        int count = length / k;
        int count1 = length % k;

        ListNode[] result = new ListNode[k];
        cur = head;
        int index = 0;
        while (cur != null) {
            ListNode nextHead = null;
            if (index <= count1 - 1) {
                int size = count + 1;
                ListNode newHead = cur;
                while (--size > 0) {
                    cur = cur.next;
                }
                nextHead = cur.next;
                cur.next = null;
                result[index++] = newHead;
                cur = nextHead;
            } else {
                int size = count;
                ListNode newHead = cur;
                while (--size > 0) {
                    cur = cur.next;
                }
                nextHead = cur.next;
                cur.next = null;
                result[index++] = newHead;
                cur = nextHead;
            }
        }
        return result;
    }
}
