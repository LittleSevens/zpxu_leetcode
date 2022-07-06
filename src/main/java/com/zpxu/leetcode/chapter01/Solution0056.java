package com.zpxu.leetcode.chapter01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: zpxu
 * @date: 2022/6/2
 * @description:
 */
public class Solution0056 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];

            if (result.size() == 0 || result.get(result.size() - 1)[1] < left) {
                result.add(intervals[i]);
            } else {
                result.get(result.size() - 1)[1] = Math.max(right, result.get(result.size() - 1)[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
