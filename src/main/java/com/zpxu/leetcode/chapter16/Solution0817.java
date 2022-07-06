package com.zpxu.leetcode.chapter16;

import com.zpxu.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: zpxu
 * @date: 2022/6/7
 * @description:
 */
public class Solution0817 {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        ListNode cur = head;
        int result = 0;
        while (cur != null) {
            if (set.contains(cur.val)
                    && (cur.next == null || !set.contains(cur.next.val))) {
                result++;
            }
            cur = cur.next;
        }
        return result;
    }
}
