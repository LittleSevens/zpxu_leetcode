package com.zpxu.other.sort;

/**
 * @author: zpxu
 * @date: 2023/12/13
 * @description:
 */
public class MergeSort {
    public void mergeSort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public void sort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        sort(array, start, mid);
        sort(array, mid + 1, end);
        merge(array, start, mid, end);
    }

    public void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[array.length];
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= end) {
            temp[k++] = array[j++];
        }
        for (int m = 0; m < k; m++) {
            array[m + start] = temp[m];
        }
    }
}
