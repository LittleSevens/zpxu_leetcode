package com.zpxu.other.sort;

/**
 * @author: zpxu
 * @date: 2023/12/13
 * @description:
 */
public class InsertSort {
    public void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > temp) {
                array[j] = array[j - 1];
                j--;
            }
            if (i!=j){
                array[j] = temp;
            }
        }
    }
}
