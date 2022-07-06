package com.zpxu.leetcode.chapter08;

import com.zpxu.ListNode;

import java.util.Stack;

/**
 * @author: zpxu
 * @date: 2022/6/3
 * @description:
 */
public class Solution0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode cur = l1;
        while (cur != null) {
            stack1.push(cur.val);
            cur = cur.next;
        }

        cur = l2;
        while (cur != null) {
            stack2.push(cur.val);
            cur = cur.next;
        }

        int carry = 0;
        ListNode dummy = new ListNode(-1);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int num1 = stack1.isEmpty() ? 0 : stack1.pop();
            int num2 = stack2.isEmpty() ? 0 : stack2.pop();

            int sum = num1 + num2 + carry;

            if (dummy.next == null) {
                dummy.next = new ListNode(sum % 10);
            } else {
                ListNode newNode = new ListNode(sum % 10);
                newNode.next = dummy.next;
                dummy.next = newNode;
            }
            carry = sum / 10;

        }

        if (carry == 1) {
            ListNode newNode = new ListNode(1);
            newNode.next = dummy.next;
            dummy.next = newNode;
        }

        return dummy.next;


    }
}
